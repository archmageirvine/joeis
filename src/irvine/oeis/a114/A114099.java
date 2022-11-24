package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A114099 Number of partitions of n into parts with digital root = 9.
 * @author Georg Fischer
 */
public class A114099 extends A000041 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(9n) = A000041(n) and for all others a(n) = 0.
    ++mN;
    return (mN % 9 == 0) ? super.next() : Z.ZERO;
  }
}
