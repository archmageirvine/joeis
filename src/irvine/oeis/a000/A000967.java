package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000967.
 * @author Sean A. Irvine
 */
public class A000967 implements Sequence {

  private long mN = 0;

  private Q fermatCoefficient(final long n, final long c) {
    return new Q(Binomial.binomial(2 * n - c, c - 1), Z.valueOf(c));
  }

  protected long step(final long c) {
    return c + 1;
  }

  @Override
  public Z next() {
    ++mN;
    Q s = Q.HALF; // so we can effectively round at the end
    for (long c = 1; c <= mN; c = step(c)) {
      s = s.add(fermatCoefficient(mN, c));
    }
    return s.toZ();
  }
}
