package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001958.
 * @author Sean A. Irvine
 */
public class A001958 implements Sequence {

  private static final CR N = CR.valueOf(13).sqrt().add(CR.FIVE).divide(CR.TWO);
  private static final CR THIRD = CR.THREE.inverse();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(THIRD)).floor(32);
  }
}
