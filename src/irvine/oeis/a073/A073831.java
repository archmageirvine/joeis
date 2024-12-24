package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;

/**
 * A073831 Maximum of A073830(k) for k between A001359(n) and A001359(n+1).
 * @author Sean A. Irvine
 */
public class A073831 extends A073830 {

  private final Sequence mLesserTwins = new A001359().skip();
  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    final long p = mLesserTwins.next().longValueExact();
    while (++mN <= p) {
      max = max.max(super.next());
    }
    --mN;
    return max;
  }
}
