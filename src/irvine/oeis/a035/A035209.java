package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;

/**
 * A035209 From a Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035209 extends Sequence0 implements Conjectural {

  // Do not use this implementation to extend the sequence as there are
  // aspects of this which I do not understand and were guessed.

  private int mN = 0;
  private int mMax = 1000;
  protected final Fast mPrime = new Fast();
  private Ds mD = updateSeries(mMax);

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

  private Ds updateSeries(final int n) {
    Ds d = Dgf.one();
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      switch (p % 23) {
        case 1:
          //System.out.println("p" + p + " " + isSolvable(p));
          if (p == 47 || isSolvable(p)) {
            final Ds dp = Dgf.multiply(Dgf.simple(Z.valueOf(p), Z.TWO), Dgf.zetam(p));
            d = Dgf.multiply(d, Dgf.pow(dp, 11));
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
            if (q.compareTo(n) < 0) {
              final Ds da = Dgf.multiply(Dgf.simple(q, Z.TWO), Dgf.zetam(q.intValueExact()));
              d = Dgf.multiply(d, da);
            }
          }
          break;
        default:
          break;
      }
    }
    d = Dgf.add(Dgf.multiply(d, Z.TWO), Dgf.one());
    return Dgf.divide(d, Z.THREE);
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

