package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.group.Gl2SubgroupModel.Generated;
import irvine.math.group.Gl2SubgroupModel.Group;
import irvine.math.group.Gl2SubgroupModel.IntKey;
import irvine.math.group.Gl2SubgroupModel.Subgroup;

/**
 * Subgroup lifting through the four-dimensional congruence kernel.
 * @author Gregory Morse
 */
final class Gl2SubgroupLift {

  private static final int DIM = 4;
  private final int mP;
  private final Group mLower;
  private final Group mUpper;
  private final Group mField;
  private final int[] mUnits;
  private final int[][][] mAdjoint;
  private final List<Space> mSpaces = new ArrayList<>();
  private final Map<IntKey, Integer> mSpaceIndex = new HashMap<>();
  private final int[][] mSpaceAction;

  Gl2SubgroupLift(final int prime, final Group lower, final Group upper) {
    mP = prime;
    mLower = lower;
    mUpper = upper;
    mField = new Group(prime, false);
    mUnits = new int[] {mField.pack(1, 0, 0, 0), mField.pack(0, 1, 0, 0),
      mField.pack(0, 0, 1, 0), mField.pack(0, 0, 0, 1)};
    mAdjoint = new int[mField.mLimit][][];
    mSpaceAction = new int[mField.mLimit][];
    for (int pivots = 0; pivots < (1 << DIM); ++pivots) {
      spaces(pivots, pivots, new int[Integer.bitCount(pivots)][], 0);
    }
  }

  private int mod(final int n) {
    return mP == 2 ? n & 1 : Math.floorMod(n, mP);
  }

  private void add(final int[] a, final int[] b, final int scale) {
    for (int k = 0; k < a.length; ++k) {
      a[k] = mod(a[k] + scale * b[k]);
    }
  }

  private boolean insert(final int[][] basis, final int[] row, final int bound) {
    for (int i = bound - 1; i >= 0; --i) {
      final int a = row[i];
      if (a != 0) {
        if (basis[i] != null) {
          add(row, basis[i], -a);
        } else {
          final int u = mField.mInverses[a];
          for (int j = 0; j < row.length; ++j) {
            row[j] = mod(row[j] * u);
          }
          basis[i] = row;
          return true;
        }
      }
    }
    return false;
  }

  private int encode(final int[] a) {
    return mField.pack(a[0], a[1], a[2], a[3]);
  }

  private int fromKernel(final int a) {
    final int[] v = mUpper.entries(a);
    v[0] -= 1;
    v[3] -= 1;
    for (int k = 0; k < DIM; ++k) {
      if (v[k] % mLower.mModulus != 0) {
        throw new IllegalStateException("Matrix is not in the congruence kernel");
      }
      v[k] /= mLower.mModulus;
    }
    return encode(v);
  }

  private int inKernel(final int code) {
    final int[] v = mField.entries(code);
    return mUpper.pack(1 + mLower.mModulus * v[0], mLower.mModulus * v[1],
      mLower.mModulus * v[2], 1 + mLower.mModulus * v[3]);
  }

  private int[][] adjoint(final int f) {
    if (mAdjoint[f] == null) {
      final int inverse = mField.inverse(f);
      final int[][] a = new int[DIM][];
      for (int i = 0; i < DIM; ++i) {
        a[i] = mField.entries(mField.conjugate(mUnits[i], f, inverse));
      }
      mAdjoint[f] = a;
    }
    return mAdjoint[f];
  }

  private int[] act(final int[][] a, final int[] x) {
    final int[] v = new int[DIM];
    for (int k = 0; k < DIM; ++k) {
      if (x[k] != 0) {
        add(v, a[k], x[k]);
      }
    }
    return v;
  }

  private final class Space {
    private final int mPivots;
    private final int[][] mBasis;
    private final int[] mReduction;
    private final int[][] mUnitImages;

    private Space(final int pivots, final int[][] basis) {
      mPivots = pivots;
      mBasis = Arrays.stream(basis).map(int[]::clone).toArray(int[][]::new);
      mReduction = new int[mField.mLimit];
      for (int x = 0; x < mReduction.length; ++x) {
        final int[] v = mField.entries(x);
        int p = pivots;
        for (int j = basis.length - 1; j >= 0; --j) {
          final int k = Integer.SIZE - 1 - Integer.numberOfLeadingZeros(p);
          if (v[k] != 0) {
            add(v, basis[j], -v[k]);
          }
          p ^= 1 << k;
        }
        mReduction[x] = encode(v);
      }
      mUnitImages = new int[DIM][];
      for (int i = 0; i < DIM; ++i) {
        mUnitImages[i] = mField.entries(mReduction[mUnits[i]]);
      }
    }
  }

  private void spaces(final int pivots, final int rem, final int[][] basis, final int index) {
    if (rem == 0) {
      final int[] key = Arrays.stream(basis).mapToInt(this::encode).toArray();
      mSpaceIndex.put(new IntKey(key), mSpaces.size());
      mSpaces.add(new Space(pivots, basis));
    } else {
      final int k = Integer.numberOfTrailingZeros(rem);
      final int allowed = ((1 << k) - 1) & ~pivots;
      int size = 1;
      for (int j = 0; j < Integer.bitCount(allowed); ++j) {
        size *= mP;
      }
      for (int x = 0; x < size; ++x) {
        final int[] row = new int[DIM];
        row[k] = 1;
        for (int j = allowed, v = x; j != 0; j &= j - 1, v /= mP) {
          row[Integer.numberOfTrailingZeros(j)] = v % mP;
        }
        basis[index] = row;
        spaces(pivots, rem ^ (1 << k), basis, index + 1);
      }
    }
  }

  private int[] spaceAction(final int f) {
    if (mSpaceAction[f] == null) {
      final int[][] a = adjoint(f);
      final int[] images = new int[mSpaces.size()];
      for (int s = 0; s < images.length; ++s) {
        final int[][] basis = new int[DIM][];
        for (final int[] row : mSpaces.get(s).mBasis) {
          insert(basis, act(a, row), DIM);
        }
        for (int i = 0; i < DIM; ++i) {
          if (basis[i] != null) {
            for (int j = i + 1; j < DIM; ++j) {
              if (basis[j] != null && basis[j][i] != 0) {
                add(basis[j], basis[i], -basis[j][i]);
              }
            }
          }
        }
        images[s] = mSpaceIndex.get(new IntKey(Arrays.stream(basis).filter(x -> x != null).mapToInt(this::encode).toArray()));
      }
      mSpaceAction[f] = images;
    }
    return mSpaceAction[f];
  }

  static final class Count {
    long mCount = 0;
    final List<Subgroup> mClasses = new ArrayList<>();
  }

  private final class Action {
    private final int mElement;
    private final int[] mSpaceImages;
    private final int[][] mAdjointAction;
    private final int[] mIndices;
    private final int[][] mOffsets;

    private Action(final Presentation p, final int element) {
      mElement = element;
      final int a = mUpper.resize(element, mLower);
      final int ai = mLower.inverse(a);
      final int ei = mUpper.inverse(element);
      final int f = mUpper.resize(element, mField);
      mSpaceImages = spaceAction(f);
      mAdjointAction = adjoint(f);
      mIndices = new int[p.mRank];
      mOffsets = new int[p.mRank][];
      for (int j = 0; j < p.mRank; ++j) {
        final int x = mLower.conjugate(p.mProjection.mGenerators[j], ai, a);
        mIndices[j] = p.mIndex.get(x);
        final int w = mUpper.conjugate(p.mWords[mIndices[j]], element, ei);
        mOffsets[j] = mField.entries(fromKernel(mUpper.multiply(w, p.mInverseLift[j])));
      }
    }
  }

  private static final class State {
    private final int[] mCoefficients;
    private final int mTransport;

    private State(final int[] coefficients, final int transport) {
      mCoefficients = coefficients;
      mTransport = transport;
    }
  }

  private final class Presentation {
    private final Subgroup mProjection;
    private final int mRank;
    private final int mVariables;
    private final int[] mLifts;
    private final int[] mInverseLift;
    private final Map<Integer, Integer> mIndex = new HashMap<>();
    private final int[] mWords;
    private final int[][][] mCoordinates;
    private final List<int[]> mRelations = new ArrayList<>();
    private final int[][] mGeneratorActions;

    private Presentation(final Subgroup projection) {
      mProjection = projection;
      mRank = projection.mGenerators.length;
      mVariables = DIM * mRank;
      mLifts = Arrays.stream(projection.mGenerators).map(x -> mLower.resize(x, mUpper)).toArray();
      mInverseLift = Arrays.stream(mLifts).map(mUpper::inverse).toArray();
      mGeneratorActions = Arrays.stream(projection.mGenerators).mapToObj(x -> spaceAction(mLower.resize(x, mField))).toArray(int[][]::new);
      final int size = projection.mOrder;
      final int[] elements = new int[size];
      mWords = new int[size];
      mCoordinates = new int[size][][];
      final int length = mVariables + 1;
      final int[][] relations = new int[DIM * length][];
      elements[0] = mLower.mIdentity;
      mIndex.put(elements[0], 0);
      mWords[0] = mUpper.mIdentity;
      mCoordinates[0] = new int[DIM][length];
      int end = 1;
      for (int i = 0; i < end; ++i) {
        final int a = elements[i];
        final int[][] acts = adjoint(mLower.resize(a, mField));
        for (int j = 0; j < mRank; ++j) {
          final int b = mLower.multiply(a, projection.mGenerators[j]);
          final int word = mUpper.multiply(mWords[i], mLifts[j]);
          final int[][] expr = new int[DIM][];
          for (int k = 0; k < DIM; ++k) {
            final int[] row = mCoordinates[i][k].clone();
            for (int t = 0; t < DIM; ++t) {
              row[DIM * j + t] = mod(row[DIM * j + t] + acts[t][k]);
            }
            expr[k] = row;
          }
          final Integer known = mIndex.putIfAbsent(b, end);
          if (known == null) {
            elements[end] = b;
            mWords[end] = word;
            mCoordinates[end++] = expr;
          } else {
            final int error = fromKernel(mUpper.multiply(word, mUpper.inverse(mWords[known])));
            final int[] original = new int[DIM * length];
            for (int k = 0; k < DIM; ++k) {
              add(expr[k], mCoordinates[known][k], -1);
              expr[k][mVariables] = mod(expr[k][mVariables] + mField.entry(error, k));
              System.arraycopy(expr[k], 0, original, k * length, length);
            }
            if (insert(relations, original.clone(), original.length)) {
              mRelations.add(original);
            }
          }
        }
      }
      if (end != size) {
        throw new IllegalStateException("Wrong order for the presented subgroup");
      }
    }

    private int[][] solve(final int id) {
      for (final int[] g : mGeneratorActions) {
        if (g[id] != id) {
          return null;
        }
      }
      final Space s = mSpaces.get(id);
      final int length = mVariables + 1;
      final int[][] rows = new int[mVariables][];
      for (int j = 0; j < mRank; ++j) {
        for (int t = s.mPivots; t != 0; t &= t - 1) {
          final int p = DIM * j + Integer.numberOfTrailingZeros(t);
          rows[p] = new int[length];
          rows[p][p] = 1;
        }
      }
      for (final int[] f : mRelations) {
        for (int k = 0; k < DIM; ++k) {
          if ((s.mPivots & (1 << k)) == 0) {
            final int[] row = new int[length];
            for (int j = 0; j < DIM; ++j) {
              final int coefficient = s.mUnitImages[j][k];
              if (coefficient != 0) {
                for (int i = 0; i < length; ++i) {
                  row[i] = mod(row[i] + coefficient * f[j * length + i]);
                }
              }
            }
            if (!insert(rows, row, mVariables) && row[mVariables] != 0) {
              return null;
            }
          }
        }
      }
      return rows;
    }

    private int eval(final int[] row, final int[] x) {
      int s = row[mVariables];
      for (int i = 0; i < mVariables; ++i) {
        s += row[i] * x[i + 1];
      }
      return mod(s);
    }

    private int[] apply(final Action a, final int[] x) {
      final int[] y = new int[x.length];
      y[0] = a.mSpaceImages[x[0]];
      final Space space = mSpaces.get(y[0]);
      for (int j = 0; j < mRank; ++j) {
        final int[] value = new int[DIM];
        for (int k = 0; k < DIM; ++k) {
          value[k] = eval(mCoordinates[a.mIndices[j]][k], x);
        }
        final int[] image = act(a.mAdjointAction, value);
        add(image, a.mOffsets[j], 1);
        final int code = space.mReduction[encode(image)];
        for (int k = 0; k < DIM; ++k) {
          y[1 + DIM * j + k] = mField.entry(code, k);
        }
      }
      return y;
    }

    private List<Action> actions() {
      final List<Action> acts = new ArrayList<>();
      for (final int g : mProjection.mNormalizer) {
        acts.add(new Action(this, mLower.resize(g, mUpper)));
      }
      for (final int x : mUnits) {
        acts.add(new Action(this, inKernel(x)));
      }
      return acts;
    }

    private void orbit(final Map<IntKey, Integer> visited, final List<Action> actions, final int[] root,
                       final boolean carry, final Count out) {
      final IntKey key = new IntKey(root);
      if (visited.containsKey(key)) {
        return;
      }
      final Map<IntKey, Integer> transport = new HashMap<>();
      transport.put(key, mUpper.mIdentity);
      final List<State> queue = new ArrayList<>();
      queue.add(new State(root, mUpper.mIdentity));
      final Generated normalizer = carry ? new Generated(mUpper) : null;
      for (int i = 0; i < queue.size(); ++i) {
        final State s = queue.get(i);
        for (final Action a : actions) {
          final int[] next = apply(a, s.mCoefficients);
          final IntKey nextKey = new IntKey(next);
          final int t = carry ? mUpper.multiply(a.mElement, s.mTransport) : mUpper.mIdentity;
          final Integer old = transport.putIfAbsent(nextKey, t);
          if (old == null) {
            queue.add(new State(next, t));
          } else if (carry) {
            normalizer.add(mUpper.multiply(mUpper.inverse(old), t));
          }
        }
      }
      visited.putAll(transport);
      final Space u = mSpaces.get(root[0]);
      final int ambient = mProjection.mNormalizerOrder * mField.mLimit;
      final int order = mProjection.mOrder * intPower(mP, u.mBasis.length);
      final int normalizerOrder = ambient / queue.size();
      if (ambient % queue.size() != 0) {
        throw new IllegalStateException("Incorrect lift orbit size");
      }
      if (carry) {
        final Generated subgroup = new Generated(mUpper);
        for (int j = 0; j < mRank; ++j) {
          final int i = 1 + DIM * j;
          final int code = mField.pack(root[i], root[i + 1], root[i + 2], root[i + 3]);
          subgroup.add(mUpper.multiply(inKernel(code), mLifts[j]));
        }
        for (final int[] v : u.mBasis) {
          subgroup.add(inKernel(encode(v)));
        }
        if (normalizer.mElements.size() != normalizerOrder || subgroup.mElements.size() != order) {
          throw new IllegalStateException("Incorrect congruence-lift orders");
        }
        out.mClasses.add(new Subgroup(subgroup.generators(), normalizer.generators(), order, normalizerOrder));
      } else {
        out.mClasses.add(new Subgroup(null, null, order, normalizerOrder));
      }
    }

    private Count count(final boolean classes, final boolean carry) {
      final Count out = new Count();
      final List<Action> action = classes ? actions() : null;
      final Map<IntKey, Integer> visited = new HashMap<>();
      long relative = 0;
      // Choose an invariant U in the vector kernel. The section above
      // the projection modulo U is constrained by its Schreier relations.
      for (int id = 0; id < mSpaces.size(); ++id) {
        final int[][] eqs = solve(id);
        if (eqs != null) {
          int dimension = 0;
          for (final int[] row : eqs) {
            if (row == null) {
              ++dimension;
            }
          }
          final long count = intPower(mP, dimension);
          relative += count;
          if (classes) {
            for (long value = 0; value < count; ++value) {
              final int[] x = new int[1 + mVariables];
              x[0] = id;
              long t = value;
              for (int j = 0; j < mVariables; ++j) {
                if (eqs[j] == null) {
                  x[j + 1] = (int) (t % mP);
                  t /= mP;
                } else {
                  x[j + 1] = mod(-eval(eqs[j], x));
                }
              }
              orbit(visited, action, x, carry, out);
            }
          }
        }
      }
      if (classes && visited.size() != relative) {
        throw new IllegalStateException("Lift orbits did not partition the solutions");
      }
      out.mCount = relative * (mLower.mOrder / mProjection.mNormalizerOrder);
      return out;
    }
  }

  private static int intPower(final int p, final int e) {
    int a = 1;
    for (int j = 0; j < e; ++j) {
      a = Math.multiplyExact(a, p);
    }
    return a;
  }

  Count count(final Subgroup projection, final boolean classes, final boolean carry) {
    return new Presentation(projection).count(classes, carry);
  }
}
