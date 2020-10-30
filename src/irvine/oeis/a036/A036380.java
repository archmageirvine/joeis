package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a246.A246547;

/**
 * A036380 Number of true prime powers whose binary order, ceiling(log_2(p^x)), is n.
 * @author Sean A. Irvine
 */
public class A036380 extends A246547 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long c = 1; // for 2^n
    while (super.next().bitLength() == mN) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
