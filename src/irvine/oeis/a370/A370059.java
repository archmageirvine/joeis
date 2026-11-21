package irvine.oeis.a370;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a369.A369931;

/**
 * A370059 Number of traceless symmetric binary matrices with 2n 1's and all row sums &gt;= 2.
 * @author Gregory Morse
 */
public class A370059 extends Sequence0 {
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(A369931.count(k, mN));
    }
    return sum;
  }
}
