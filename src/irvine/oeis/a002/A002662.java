package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002662 a(n) = 2^n - 1 - n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A002662 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(1).subtract((mN + 1) * (long) mN / 2);
  }
}
