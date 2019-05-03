package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019558 Coordination sequence for <code>F_4</code> lattice.
 * @author Sean A. Irvine
 */
public class A019558 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).square().multiply(4).subtract(3 * mN - 2).multiply(mN).multiply(16);
  }
}
