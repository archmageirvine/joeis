package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084046 Smallest prime p such that p + n is an n-th power, or 0 if no such number exists. I.e., smallest prime of the form k^n - n.
 * @author Sean A. Irvine
 */
public class A084046 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 27) {
      return Z.ZERO;
    }
    if ((mN & 3) == 0 && Predicates.SQUARE.is(mN >>> 2)) {
      // a(4m^2) == 0
      return Z.ZERO;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

