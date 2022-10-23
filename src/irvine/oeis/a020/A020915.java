package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020915 Number of terms in base-3 representation of 2^n.
 * @author Sean A. Irvine
 */
public class A020915 extends Sequence0 {

  private static final CR LOG = CR.TWO.log().divide(CR.THREE.log());
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(++mN).floor().add(1);
  }
}
