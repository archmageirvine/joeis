package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a006.A006883;

/**
 * A004042 Periods of reciprocals of A006883, starting with first nonzero digit.
 * @author Sean A. Irvine
 */
public class A004042 extends A006883 {

  @Override
  public Z next() {
    final Z pp = super.next();
    final int p = pp.intValueExact();
    if (p == 2) {
      return Z.ZERO;
    }
    final Z tau = Z.TEN.pow(p - 1).divide(p);
    final String ts = tau.toString();
    return tau.multiply(Z.TEN.pow(p - 1 - ts.length()));
  }
}

