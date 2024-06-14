package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.oeis.a054.A054875;

/**
 * A070787 Number of triangles with sides whose squares are integers and with positive integer area and longest side of length sqrt(n).
 * @author Sean A. Irvine
 */
public class A070787 extends A054875 {

  private static final int ACCURACY = -100;

  @Override
  protected boolean is(final long x, final long y, final long z) {
    final CR ar = CR.valueOf(x).sqrt();
    final CR br = CR.valueOf(y).sqrt();
    final CR cr = CR.valueOf(z).sqrt();
    if (ar.add(br).compareTo(cr, ACCURACY) <= 0) {
      return false;
    }
    final CR s = ar.add(br).add(cr).divide(2);
    final CR t = s.multiply(s.subtract(ar)).multiply(s.subtract(br)).multiply(s.subtract(cr));
    if (!t.isInteger()) {
      return false;
    }
    return t.assumeInt().toZ().isSquare();
  }
}
