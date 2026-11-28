package irvine.math.group;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * Schreier presentation of binary projection groups with linear lift coordinates.
 * @author Gregory Morse
 */
final class BinaryLiftChain {

  private final int mN;
  private final int mDimension;
  private final int mVariables;
  private final Lift mRoot;
  private final IntBinaryOperator mProduct;
  private final IntUnaryOperator mInverse;
  private final IntBinaryOperator mPoints;
  private final IntFunction<int[]> mAction;
  private Lift[][] mTransversals;
  private Lift[][] mInverses;
  private List<BigInteger[]> mRelations;
  private long mOrder;

  private static final class Lift {
    private final int mElement;
    private final BigInteger[] mValue;

    private Lift(final int element, final BigInteger[] value) {
      mElement = element;
      mValue = value;
    }
  }

  private static final class Generator {
    private final Lift mLift;
    private final int mLevel;

    private Generator(final Lift lift, final int level) {
      mLift = lift;
      mLevel = level;
    }
  }

  BinaryLiftChain(final int n, final int dimension, final int variables, final int identity,
                  final int[] generators, final BigInteger[][] initial, final IntBinaryOperator product,
                  final IntUnaryOperator inverse, final IntBinaryOperator points, final IntFunction<int[]> action) {
    mN = n;
    mDimension = dimension;
    mVariables = variables;
    mRoot = new Lift(identity, zero());
    mProduct = product;
    mInverse = inverse;
    mPoints = points;
    mAction = action;
    final List<Generator> strong = new ArrayList<>();
    for (int i = 0; i < generators.length; ++i) {
      final int g = generators[i];
      strong.add(new Generator(new Lift(g, initial[i]), level(g)));
    }
    while (true) {
      build(strong);
      final Generator missing = presentation(strong);
      if (missing == null) {
        return;
      }
      strong.add(missing);
    }
  }

  private BigInteger[] zero() {
    final BigInteger[] value = new BigInteger[mDimension];
    Arrays.fill(value, BigInteger.ZERO);
    return value;
  }

  private void addAction(final BigInteger[] out, final int element, final BigInteger[] value) {
    final int[] map = mAction.apply(element);
    for (int i = 0; i < mDimension; ++i) {
      if (value[i].signum() != 0) {
        for (int b = map[i]; b != 0; b &= b - 1) {
          final int j = Integer.numberOfTrailingZeros(b);
          out[j] = out[j].xor(value[i]);
        }
      }
    }
  }

  private Lift multiply(final Lift left, final Lift right) {
    final BigInteger[] value = left.mValue.clone();
    addAction(value, left.mElement, right.mValue);
    return new Lift(mProduct.applyAsInt(left.mElement, right.mElement), value);
  }

  private Lift inverse(final Lift lift) {
    final int inverse = mInverse.applyAsInt(lift.mElement);
    final BigInteger[] value = zero();
    addAction(value, inverse, lift.mValue);
    return new Lift(inverse, value);
  }

  private int level(final int element) {
    for (int l = 0; l < mN; ++l) {
      if (mPoints.applyAsInt(element, 1 << l) != (1 << l)) {
        return l;
      }
    }
    return mN;
  }

  private void build(final List<Generator> strong) {
    final int size = 1 << mN;
    mTransversals = new Lift[mN][size];
    mInverses = new Lift[mN][size];
    mOrder = 1;
    for (int l = 0; l < mN; ++l) {
      final int[] orbit = new int[size];
      final Lift[] trans = mTransversals[l];
      orbit[0] = 1 << l;
      trans[orbit[0]] = mRoot;
      int end = 1;
      for (int i = 0; i < end; ++i) {
        for (final Generator gen : strong) {
          if (gen.mLevel >= l) {
            final int y = mPoints.applyAsInt(gen.mLift.mElement, orbit[i]);
            if (trans[y] == null) {
              trans[y] = multiply(gen.mLift, trans[orbit[i]]);
              orbit[end++] = y;
            }
          }
        }
      }
      mOrder *= end;
      for (int i = 0; i < end; ++i) {
        mInverses[l][orbit[i]] = inverse(trans[orbit[i]]);
      }
    }
  }

  private Generator presentation(final List<Generator> strong) {
    final BigInteger[] basis = new BigInteger[mDimension * mVariables];
    mRelations = new ArrayList<>();
    for (int k = 0; k < mN; ++k) {
      for (int x = 1; x < mTransversals[k].length; ++x) {
        if (mTransversals[k][x] == null) {
          continue;
        }
        for (final Generator gen : strong) {
          if (gen.mLevel < k) {
            continue;
          }
          final int y = mPoints.applyAsInt(gen.mLift.mElement, x);
          Lift lift = multiply(mInverses[k][y], multiply(gen.mLift, mTransversals[k][x]));
          for (int j = k + 1; j < mN; ++j) {
            final int p = mPoints.applyAsInt(lift.mElement, 1 << j);
            if (mInverses[j][p] == null) {
              return new Generator(lift, j);
            }
            lift = multiply(mInverses[j][p], lift);
          }
          if (lift.mElement != mRoot.mElement) {
            throw new IllegalStateException("Projection action is not faithful");
          }
          BigInteger flat = BigInteger.ZERO;
          for (int j = 0; j < mDimension; ++j) {
            flat = flat.or(lift.mValue[j].shiftLeft(j * mVariables));
          }
          if (BinarySplitSubgroups.insert(basis, flat)) {
            mRelations.add(lift.mValue);
          }
        }
      }
    }
    return null;
  }

  long order() {
    return mOrder;
  }

  List<BigInteger[]> relations() {
    return mRelations;
  }

  BigInteger[] word(int element) {
    Lift word = mRoot;
    for (int l = 0; l < mN; ++l) {
      final int point = mPoints.applyAsInt(element, 1 << l);
      final Lift t = mTransversals[l][point];
      if (t == null) {
        return null;
      }
      word = multiply(word, t);
      element = mProduct.applyAsInt(mInverses[l][point].mElement, element);
    }
    return element == mRoot.mElement ? word.mValue : null;
  }
}
