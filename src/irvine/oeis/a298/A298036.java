package irvine.oeis.a298;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A298036 Coordination sequence of Dual(4.6.12) tiling with respect to a 12-valent node.
 * @author Sean A. Irvine
 */
public class A298036 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).multiply(6).multiply(1 + (mN & 1));
  }
}
