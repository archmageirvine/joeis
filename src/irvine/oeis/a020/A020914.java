package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020914 Number of digits in the <code>base-2</code> representation of <code>3^n</code>.
 * @author Sean A. Irvine
 */
public class A020914 implements Sequence {

  private static final CR LOG = CR.THREE.log().divide(CR.TWO.log());
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(CR.valueOf(++mN)).floor().add(1);
  }
}
