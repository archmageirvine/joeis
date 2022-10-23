package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014494 Even triangular numbers.
 * @author Sean A. Irvine
 */
public class A014494 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN + 1).multiply(2 * (mN + (mN & 1))).divide2();
  }
}
