package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063259 First nonzero digit after decimal point in sqrt(p(n+1)) - sqrt(p(n)) where p(n) is n-th prime.
 * @author Sean A. Irvine
 */
public class A063259 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    CR v = CR.valueOf(mP).sqrt().subtract(CR.valueOf(q).sqrt()).frac();
    while (v.compareTo(CR.ONE) < 0) {
      v = v.multiply(10);
    }
    return v.floor();
  }
}
