package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035209 From a Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035209 implements Sequence {

  // WARNING: Do not use this implementation to extend the sequence as there are
  // aspects of this which I do not understand and were guessed.

  private int mN = 0;
  private int mMax = 1000;
  protected final Fast mPrime = new Fast();
  private DirichletSeries mD = updateSeries(mMax);

  // Test for solution to 6x^2+xy+y^2 = p

  private boolean isSolvable(final long p) {
    // This is crappy
    for (long x = 0; x * x <= p; ++x) {
      final long s = p - 6 * x * x;
      long y = 0;
      while (y * y <= p) {
        if (y * y - x * y == s) {
          return true;
        }
        if (y * y + x * y == s) {
          return true;
        }
        ++y;
      }
    }
    return false;
  }

  private DirichletSeries updateSeries(final int n) {
    DirichletSeries d = DirichletSeries.ONE;
    for (long p = 2; p <= n; p = mPrime.nextPrime(p)) {
      switch ((int) (p % 23)) {
        case 1:
          //System.out.println("p" + p + " " + isSolvable(p));
          if (p == 47 || isSolvable(p)) {
            final DirichletSeries dp = DirichletSeries.zetaNum(p, n, Z.TWO).multiply(DirichletSeries.zeta(p, n, Z.ONE), n);
            d = d.multiply(dp.pow(11, n), n);
          }
          break;
        case 2:
        case 3:
        case 4:
        case 6:
        case 8:
        case 9:
        case 12:
        case 13:
        case 16:
        case 18:
          if (isSolvable(p)) {
            final Z q = Z.valueOf(p).pow(11);
            //System.out.println("q=" + q + " " + p + "^11");
            if (q.compareTo(Z.valueOf(n)) < 0) {
              final DirichletSeries da = DirichletSeries.zetaNum(q.intValueExact(), n, Z.TWO).multiply(DirichletSeries.zeta(q.intValueExact(), n, Z.ONE), n);
              d = d.multiply(da, n);
            }
          }
          break;
        default:
          break;
      }
    }
    d = d.multiply(Z.TWO);
    d.put(Z.ONE, Z.THREE); // effectively does the +1
    //d = d.multiply(DirichletSeries.zeta(23, n, Z.ONE), n);
    return d.divide(Z.THREE);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mMax || mD == null) {
        mMax *= 2;
        mD = updateSeries(mMax);
      }
      final Z t = mD.coeff(mN);
      if (!t.isZero() && mN != 47) {
        return Z.valueOf(mN);
      }
    }
  }
}

