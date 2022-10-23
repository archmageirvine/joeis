package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007758 a(n) = 2^n*n^2.
 * @author Sean A. Irvine
 */
public class A007758 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().shiftLeft(mN);
  }
}
