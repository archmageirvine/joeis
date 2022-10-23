package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000824 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000824 extends Sequence1 {

  private int mN = 0;

  private Z b(final int n, final int r, final int s) {
    return Z.ONE.shiftLeft(r * (1 << n)).add(Z.ONE.shiftLeft(s * (1 << (n - 1))).multiply((1 << n) - 1)).shiftRight(n);
  }

  @Override
  public Z next() {
    ++mN;
    return b(mN, 3, 3).add(b(mN, 2, 3).multiply(3)).add(b(mN, 1, 1).multiply2()).divide(6);
  }
}

