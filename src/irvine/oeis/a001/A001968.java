package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001968.
 * @author Sean A. Irvine
 */
public class A001968 implements Sequence {

  private static final CR N = CR.FIVE.sqrt().add(CR.THREE);
  private static final CR THREE_QUARTERS = CR.THREE.divide(CR.FOUR);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(THREE_QUARTERS)).floor(32);
  }
}
