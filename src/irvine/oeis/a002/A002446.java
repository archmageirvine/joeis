package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002446 a(n) = 2^(2*n+1) - 2.
 * @author Sean A. Irvine
 */
public class A002446 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN).subtract(2);
  }
}
