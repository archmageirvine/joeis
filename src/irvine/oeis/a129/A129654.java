package irvine.oeis.a129;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A129654 Number of different ways to represent n as general polygonal number P(m,r) = 1/2*r*((m-2)*r-(m-4)) = n&gt;1, for m,r&gt;1.
 * @author Sean A. Irvine
 */
public class A129654 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(2 * ++mN).divisors()) {
      final long d = dd.longValue();
      if (d > 1) {
        final long t = 2 * mN / d - 4 + 2 * d;
        if (t % (d - 1) == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
