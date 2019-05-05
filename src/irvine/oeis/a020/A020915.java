package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020915.
 * @author Sean A. Irvine
 */
public class A020915 implements Sequence {

  private static final CR LOG = CR.TWO.log().divide(CR.THREE.log());
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(CR.valueOf(++mN)).floor(32).add(1);
  }
}
