package irvine.factor.util;

import java.util.ArrayList;
import java.util.BitSet;

import irvine.math.z.Z;

/**
 * Routines to build and use a factor base.
 *
 * @author Sean A. Irvine
 */
public class FactorBase {

  /** The factor base. */
  private final int[] mFactorBase;
  /** First Shanks solution. */
  private final int[] mShanks1;
  /** Second Shanks solution. */
  private final int[] mShanks2;


  /**
   * Construct a factor base for a given integer.  The constructed
   * factor base contains -1 and all primes less than the given
   * bound such that <code>(n|p)=1</code>.
   *
   * @param n number to compute factor base for
   * @param bound largest value to store in factor base
   */
  public FactorBase(final Z n, final int bound) {
    final ArrayList<Z> fb = new ArrayList<>();
    fb.add(Z.NEG_ONE);
    if (bound >= 2L && n.jacobi(Z.TWO) == 1) {
      fb.add(Z.TWO);
    }
    int p = 3;
    Z zp = Z.valueOf(3L);
    while (p <= bound) {
      if (n.jacobi(zp) == 1) {
        fb.add(zp);
      }
      do {
        p += 2;
        zp = zp.add(2L);
      } while (!zp.isPrime());
    }
    mFactorBase = new int[fb.size()];
    for (int i = 0; i < fb.size(); ++i) {
      mFactorBase[i] = fb.get(i).intValue();
    }

    final Z sqrtN = n.sqrt();
    mShanks1 = new int[mFactorBase.length];
    mShanks2 = new int[mFactorBase.length];
    for (int i = 0; i < mFactorBase.length; ++i) {
      final Z fbi = fb.get(i);
      final Z t = n.modSqrt(fbi);
      if (t != null) {
        mShanks1[i] = t.subtract(sqrtN).mod(fbi).intValue();
        mShanks2[i] = t.negate().subtract(sqrtN).mod(fbi).intValue();
      }
    }
  }

  /**
   * Return the size of the factor base.
   *
   * @return factor base size
   */
  public int size() {
    return mFactorBase.length;
  }

  /**
   * Get a factor base element.
   *
   * @param index factor base index
   * @return the element
   */
  public int get(final int index) {
    return mFactorBase[index];
  }


  /**
   * Return the first Shanks solution for a factor base
   * index.
   *
   * @param index index to get Shanks solution for.
   * @return Shanks solution.
   */
  public int getShanks1(final int index) {
    return mShanks1[index];
  }

  /**
   * Return the second Shanks solution for a factor base
   * index.
   *
   * @param index index to get Shanks solution for.
   * @return Shanks solution.
   */
  public int getShanks2(final int index) {
    return mShanks2[index];
  }


  /**
   * Factor a number over the factor base.  Attempt to factor the
   * given number using the factor base.  If factorization is not
   * possible then null is returned; otherwise an array is
   * returned giving the power of each factor base element dividing
   * <code>n</code>.
   *
   * @param n number to factor
   * @return factor index vector or null
   */
  public BitSet factor(Z n) {
    if (n == null || n.isZero()) {
      return null;
    }
    final BitSet v = new BitSet(size());
    if (n.signum() < 0) {
      v.set(0);
      n = n.negate();
    }
    for (int i = 1; i < size(); ++i) {
      final int p = mFactorBase[i];
      // check for 2 since we can do this quicker than normal
      if (p == 2) {
        final Z on = n.makeOdd();
        if ((n.auxiliary() & 1) != 0) {
          v.set(i);
        }
        n = on;
        continue;
      }
      boolean c = false;
      Z t = n.divide(p);
      while (n.auxiliary() == 0) {
        n = t;
        c ^= true;
        t = n.divide(p);
      }
      if (c) {
        v.set(i);
      }
      if (Z.ONE.equals(n)) {
        return v;
      }
    }
    return null;
  }

}

