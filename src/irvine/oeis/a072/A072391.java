package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019554;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072391 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A019554();
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mN / s.next().longValueExact());
    }
    return sum;
  }
}
