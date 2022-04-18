package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A129527 a(2n) = a(n) + 2n, a(2n+1) = 2n + 1.
 * @author Georg Fischer
 */
public class A129527 extends A000265 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : Z.TWO.multiply(mN).subtract(super.next());
  }
}
