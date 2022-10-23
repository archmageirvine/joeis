package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007582 a(n) = 2^(n-1)*(1+2^n).
 * @author Sean A. Irvine
 */
public class A007582 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(1).shiftLeft(mN - 1);
  }
}
