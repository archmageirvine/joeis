package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014629 Number of segments created by diagonals of n-gon.
 * @author Sean A. Irvine
 */
public class A014629 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(6).multiply(mN).add(17).multiply(mN).subtract(24).multiply(mN).divide(12);
  }
}
