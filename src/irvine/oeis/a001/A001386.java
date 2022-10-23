package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001386 Coordination sequence for 4-dimensional I-centered tetragonal orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A001386 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(3).shiftLeft(4).add(20 * mN).divide(3);
  }
}
