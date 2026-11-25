package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Sum of the irreducible character degrees of GL(3,Z_n).
 * @author Gregory Morse
 */
public final class Gl3CharacterDegrees {

  private Gl3CharacterDegrees() { }

  // The matrix entries are packed in radix modulus, in row-major order.
  private static final class LocalGroup {
    private final int mModulus;
    private final int[] mX = new int[9];
    private final int[] mY = new int[9];
    private final int[] mElements;
    private final int[] mInverse;
    private final int[] mClass;
    private final List<Integer> mReps = new ArrayList<>();
    private final List<Integer> mSizes = new ArrayList<>();
    private final int mIdentity;

    private LocalGroup(final int modulus, final int order) {
      mModulus = modulus;
      int bound = 1;
      for (int k = 0; k < 9; ++k) {
        bound = Math.multiplyExact(bound, modulus);
      }
      mClass = new int[bound];
      Arrays.fill(mClass, -1);
      mInverse = new int[bound];
      mElements = new int[order];
      final int[] units = new int[modulus];
      final List<Integer> generators = new ArrayList<>();
      final List<Integer> inverseGenerators = new ArrayList<>();
      mIdentity = pack(1, 0, 0, 0, 1, 0, 0, 0, 1);
      for (int i = 1; i < modulus; ++i) {
        for (int j = 1; j < modulus; ++j) {
          if (i * j % modulus == 1) {
            units[i] = j;
            if (i != 1) {
              generators.add(pack(i, 0, 0, 0, 1, 0, 0, 0, 1));
              inverseGenerators.add(pack(j, 0, 0, 0, 1, 0, 0, 0, 1));
            }
            break;
          }
        }
      }
      // Elementary matrices and diagonal units generate over a local ring.
      for (int k = 0; k < 9; ++k) {
        if (k % 4 != 0) {
          final int[] a = {1, 0, 0, 0, 1, 0, 0, 0, 1};
          a[k] = 1;
          generators.add(pack(a));
          a[k] = -1;
          inverseGenerators.add(pack(a));
        }
      }
      int next = 0;
      for (int x = 0; x < bound; ++x) {
        unpack(x, mX);
        final int a = mX[0];
        final int b = mX[1];
        final int c = mX[2];
        final int d = mX[3];
        final int e = mX[4];
        final int f = mX[5];
        final int g = mX[6];
        final int h = mX[7];
        final int i = mX[8];
        final int v = e * i - f * h;
        final int w = f * g - d * i;
        final int z = d * h - e * g;
        final int u = units[Math.floorMod(a * v + b * w + c * z, modulus)];
        if (u != 0) {
          mElements[next++] = x;
          mInverse[x] = pack(u * v, u * (c * h - b * i), u * (b * f - c * e),
            u * w, u * (a * i - c * g), u * (c * d - a * f),
            u * z, u * (b * g - a * h), u * (a * e - b * d));
        }
      }
      if (next != order) {
        throw new IllegalStateException("Wrong general linear group order");
      }
      final int[] queue = new int[order];
      for (final int x : mElements) {
        if (mClass[x] < 0) {
          final int index = mReps.size();
          mReps.add(x);
          mClass[x] = index;
          queue[0] = x;
          int end = 1;
          for (int start = 0; start < end; ++start) {
            for (int k = 0; k < generators.size(); ++k) {
              final int y = multiply(multiply(generators.get(k), queue[start]), inverseGenerators.get(k));
              if (mClass[y] < 0) {
                mClass[y] = index;
                queue[end++] = y;
              }
            }
          }
          mSizes.add(end);
        }
      }
    }

    private int pack(final int... values) {
      int result = 0;
      for (final int v : values) {
        result = result * mModulus + Math.floorMod(v, mModulus);
      }
      return result;
    }

    private void unpack(int packed, final int[] values) {
      for (int k = 8; k >= 0; --k) {
        values[k] = packed % mModulus;
        packed /= mModulus;
      }
    }

    private int multiply(final int x, final int y) {
      unpack(x, mX);
      unpack(y, mY);
      int result = 0;
      for (int i = 0; i < 9; i += 3) {
        for (int j = 0; j < 3; ++j) {
          result = result * mModulus + (mX[i] * mY[j] + mX[i + 1] * mY[j + 3]
            + mX[i + 2] * mY[j + 6]) % mModulus;
        }
      }
      return result;
    }

    private Z[][] commutatorOperator() {
      final int n = mReps.size();
      final int order = mElements.length;
      final Z[] coefficients = new Z[n];
      for (int c = 0; c < n; ++c) {
        final int z = mReps.get(c);
        long count = 0;
        for (final int y : mElements) {
          // [x,y]=z iff x y x^-1=z y; the solutions form a centralizer coset.
          if (mClass[y] == mClass[multiply(z, y)]) {
            count += order / mSizes.get(mClass[y]);
          }
        }
        coefficients[c] = Z.valueOf(count);
      }
      final Z[][] matrix = new Z[n][n];
      for (int r = 0; r < n; ++r) {
        final int z = mReps.get(r);
        Arrays.fill(matrix[r], Z.ZERO);
        for (final int x : mElements) {
          final int c = mClass[multiply(mInverse[x], z)];
          matrix[r][c] = matrix[r][c].add(coefficients[mClass[x]]);
        }
      }
      return matrix;
    }

    private Z degreeSum(final Z order) {
      final List<Z> roots = new ArrayList<>();
      final List<Z> values = new ArrayList<>();
      for (final Z d : Jaguar.factor(order).divisors()) {
        // The degree divides |G| and its square is at most |G|.
        if (d.square().compareTo(order) <= 0) {
          final Z value = order.divide(d);
          roots.add(value.square());
          values.add(value);
        }
      }
      final Q[] polynomial = ClassAlgebraPolynomial.interpolate(roots.toArray(new Z[0]), values.toArray(new Z[0]));
      final Z[][] operator = commutatorOperator();
      final int id = mClass[mIdentity];
      Z[] power = new Z[operator.length];
      Arrays.fill(power, Z.ZERO);
      power[id] = Z.ONE;
      Q sum = Q.ZERO;
      for (int k = 0; k < polynomial.length; ++k) {
        // The commutator sum acts as (|G|/d)^2 on degree d.
        // The identity coefficient of the associated central idempotent
        // is d^2/|G|, so P((|G|/d)^2)=|G|/d gives contribution d.
        sum = sum.add(polynomial[k].multiply(power[id]));
        if (k + 1 < polynomial.length) {
          final Z[] next = new Z[power.length];
          for (int i = 0; i < power.length; ++i) {
            Z value = Z.ZERO;
            for (int j = 0; j < power.length; ++j) {
              if (!operator[i][j].isZero() && !power[j].isZero()) {
                value = value.add(operator[i][j].multiply(power[j]));
              }
            }
            next[i] = value;
          }
          power = next;
        }
      }
      return sum.toZ();
    }
  }

  private static Z fieldSum(final Z q) {
    return q.square().multiply(q.subtract(1)).multiply(q.pow(3).subtract(1));
  }

  private static Z lengthTwoSum(final Z q) {
    // Singla, Table 2 and Lemma 7.5 (arXiv:1001.5304).
    // Sum the centralizer character degrees multiplied by their indices:
    // scalar, cyclic, split noncyclic, and Jordan (2,1), respectively.
    final Z order = LinearGroupOrder.general(3, q);
    return q.multiply(fieldSum(q))
      .add(q.pow(3).multiply(order))
      .add(q.square().multiply(order.divide(q.add(1))))
      .add(q.multiply(q.pow(3).subtract(1)).multiply(q.add(1))
        .multiply(q.subtract(1).square()).multiply(q.square().add(2)));
  }

  /**
   * Sum the irreducible character degrees of GL(3,Z_n).
   * @param modulus positive modulus
   * @return sum of degrees
   */
  public static Z sum(final long modulus) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z result = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e == 1) {
        result = result.multiply(fieldSum(p));
      } else if (e == 2) {
        result = result.multiply(lengthTwoSum(p));
      } else {
        final Z order = LinearGroupOrder.general(3, p).multiply(p.pow(9L * (e - 1)));
        result = result.multiply(new LocalGroup(p.pow(e).intValueExact(), order.intValueExact()).degreeSum(order));
      }
    }
    return result;
  }
}
