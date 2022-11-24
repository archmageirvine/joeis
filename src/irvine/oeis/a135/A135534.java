package irvine.oeis.a135;

import irvine.math.z.Z;

/**
 * A135534 a(1) = 1; for n&gt;=1, a(2n) = A135561(n), a(2n+1) = 0.
 * @author Georg Fischer
 */
public class A135534 extends A135561 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    return ((mN & 1) == 0) ? super.next() : Z.ZERO;
  }
}
