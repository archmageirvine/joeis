package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014493.
 * @author Sean A. Irvine
 */
public class A014493 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 1).multiply(2 * (mN - 1 + (mN & 1))).divide2();
  }
}
