package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034888 Number of digits in 3^n.
 * @author Sean A. Irvine
 */
public class A034888 extends Sequence0 {

  private static final CR LOG = CR.THREE.log().divide(CR.TEN.log());
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(++mN).floor().add(1);
  }
}

