package irvine.oeis.a135;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A135250 a(n) = number of digits in the decimal expansion of A046967(n).
 * @author Sean A. Irvine
 */
public class A135250 extends A000040 {

  private static final CR LOG = CR.LOG2.divide(CR.LOG10);
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.isOdd()) {
      mProd = mProd.multiply(p);
    }
    return LOG.multiply(mProd).floor().add(1);
  }
}

