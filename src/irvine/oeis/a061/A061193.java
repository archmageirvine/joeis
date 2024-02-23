package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A061193 Number of digits in n-th even perfect number (A000396).
 * @author Sean A. Irvine
 */
public class A061193 extends A000043 {

  private static final CR LOG = CR.TWO.log().divide(CR.LOG10);

  @Override
  public Z next() {
    return LOG.multiply(super.next().multiply2().subtract(1)).floor().add(1);
  }
}
