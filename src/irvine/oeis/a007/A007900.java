package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007900 Coordination sequence for D_4 lattice.
 * @author Sean A. Irvine
 */
public class A007900 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).square().multiply2().add(1).multiply(mN).multiply(8);
  }
}
