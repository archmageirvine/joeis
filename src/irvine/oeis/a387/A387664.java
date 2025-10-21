package irvine.oeis.a387;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387664 Smallest prime number with a constant convergence speed &gt;= n.
 * @author Sean A. Irvine
 */
public class A387664 extends Sequence1 {

  // After Marco Ripa, only good for a few terms

  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mS = new ArrayList<>();
  private Z mK = Z.ONE;
  private int mN = 1;

  static long v(final Z a) {
    if (a.mod(10) == 0 || a.isOne()) {
      return 0;
    }
    final int r = (int) a.mod(20);
    switch (r) {
      case 1:
        return Math.min(Functions.VALUATION.l(a.subtract(1), 2), Functions.VALUATION.l(a.subtract(1), 5));
      case 11:
        return Math.min(Functions.VALUATION.l(a.add(1), 2), Functions.VALUATION.l(a.subtract(1), 5));
      case 2:
      case 8:
      case 12:
      case 18:
        return Functions.VALUATION.l(a.square().add(1), 5);
      case 3:
      case 7:
        return Math.min(Functions.VALUATION.l(a.add(1), 2), Functions.VALUATION.l(a.square().add(1), 5));
      case 13:
      case 17:
        return Math.min(Functions.VALUATION.l(a.subtract(1), 2), Functions.VALUATION.l(a.square().add(1), 5));
      case 4:
      case 14:
        return Functions.VALUATION.l(a.add(1), 5);
      case 5:
        return Functions.VALUATION.l(a.subtract(1), 2);
      case 15:
        return Functions.VALUATION.l(a.add(1), 2);
      case 6:
      case 16:
        return Functions.VALUATION.l(a.subtract(1), 5);
      case 9:
        return Math.min(Functions.VALUATION.l(a.subtract(1), 2), Functions.VALUATION.l(a.add(1), 5));
      case 19:
        return Math.min(Functions.VALUATION.l(a.add(1), 2), Functions.VALUATION.l(a.add(1), 5));
      default:
        return 0;
    }
  }

  @Override
  public Z next() {
    while (mS.size() <= mN || mS.get(mN) == null) {
      mK = mPrime.nextPrime(mK);
      if (mK.isProbablePrime()) {
        final long t = v(mK);
        while (mS.size() <= t) {
          mS.add(null);
        }
        for (int n = 0; n <= t; ++n) {
          if (mS.get(n) == null) {
            mS.set(n, mK);
          }
        }
      }
    }
    return mS.get(mN++);
  }
}

