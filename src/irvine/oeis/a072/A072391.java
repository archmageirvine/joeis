package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019554;

/**
 * A072391 D2(n,n) = Sum_{1&lt;=k&lt;=n} (d_n(k^2)), where d_a(k^2)=card{d: d|k and 1&lt;=d&lt;=a} for real a.
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
