package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073832 extends A073830 {

  private final Sequence mLesserTwins = new A001359().skip();
  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    long maxN = 0;
    final long p = mLesserTwins.next().longValueExact();
    while (++mN <= p) {
      final Z t = super.next();
      if (t.compareTo(max) > 0) {
        max = t;
        maxN = mN;
      }
    }
    --mN;
    return Z.valueOf(maxN);
  }
}
