package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A248378 a(2n) = concatenation of n+1 with n+2, a(2n+1) = concatenation of n+2 with n+1.
 * @author Georg Fischer
 */
public class A248378 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? new Z(String.valueOf(mN / 2 + 1) + String.valueOf(mN / 2 + 2)) : new Z(String.valueOf(mN / 2 + 2) + String.valueOf(mN / 2 + 1));
  }
}
