package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002999 Expansion of (1 + x*exp(x))^2.
 * @author Sean A. Irvine
 */
public class A002999 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    return n.square().subtract(n).shiftLeft(mN - 2).add(2L * mN);
  }
}
