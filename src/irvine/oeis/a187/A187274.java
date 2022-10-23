package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A187274 a(n) = n*4^(n/2 - 1)*(9 + (-1)^n).
 * @author Sean A. Irvine
 */
public class A187274 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply((mN & 1) == 0 ? 10 : 8).shiftLeft(mN - 2);
  }
}
