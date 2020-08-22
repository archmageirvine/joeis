package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020914 Number of digits in the base-2 representation of 3^n.
 * @author Sean A. Irvine
 */
public class A020914 implements Sequence {

  private static final CR LOG = CR.THREE.log().divide(CR.TWO.log());
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(++mN).floor().add(1);
  }
}
