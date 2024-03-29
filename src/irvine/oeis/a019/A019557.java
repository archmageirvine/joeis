package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019557 Coordination sequence for G_2 lattice.
 * @author Sean A. Irvine
 */
public class A019557 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(18 * mN - 6);
  }
}
