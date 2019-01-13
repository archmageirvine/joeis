package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014629.
 * @author Sean A. Irvine
 */
public class A014629 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(6).multiply(mN).add(17).multiply(mN).subtract(24).multiply(mN).divide(12);
  }
}
