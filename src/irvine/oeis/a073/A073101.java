package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073101 Number of integer solutions (x,y,z) to 4/n = 1/x + 1/y + 1/z satisfying 0 &lt; x &lt; y &lt; z.
 * @author Sean A. Irvine
 */
public class A073101 extends Sequence1 {

  // After Robert Israel

  private long mN = 0;
  private final long mNum;

  protected A073101(final long num) {
    mNum = num;
  }

  /** Construct the sequence. */
  public A073101() {
    this(4);
  }

  @Override
  public Z next() {
    final Q u = new Q(mNum, ++mN);
    long cnt = 0;
    for (long x = 1 + mN / mNum; x < (3 * mN + mNum - 1) / mNum; ++x) {
      final Q t = u.subtract(new Q(1, x));
      final long p = t.num().longValueExact();
      final long q = t.den().longValueExact();
      for (final Z dd : Jaguar.factor(q * q).divisors()) {
        final long d = dd.longValue();
        if (d < q && (d + q) % p == 0) {
          final long y = (d + q) / p;
          if (y > x) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
