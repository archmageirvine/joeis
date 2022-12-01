package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a055.A055265;

/**
 * A128280 a(n) is the least number not occurring earlier such that a(n)+a(n-1) is prime, a(0) = 0.
 * @author Georg Fischer
 */
public class A128280 extends A055265 {

  private int mN = -1;


  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    // a(2n-1) = A055265(2n-1) + 1, a(2n) = A055265(2n) - 1, for all n >= 1.
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    return ((mN & 1) == 0) ? super.next().subtract(1) : super.next().add(1);
  }
}
