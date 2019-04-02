package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019560 Coordination sequence for C_4 lattice.
 * @author Sean A. Irvine
 */
public class A019560 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).square().multiply2().add(1).multiply(mN).divide(3).multiply(32);
  }
}
