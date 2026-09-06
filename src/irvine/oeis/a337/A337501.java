package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337501 Minimum number of painted cells in an n X n grid to avoid unpainted trominoes.
 * @author Sean A. Irvine
 */
public class A337501 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).square().divide2()
      : Z.valueOf(mN).multiply(mN - 1).divide2().add(mN / 3);
  }
}

