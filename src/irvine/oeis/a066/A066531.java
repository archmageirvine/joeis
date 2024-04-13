package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066531 Numbers which can be expressed as the product of a number and its reversal in at least two different ways.
 * @author Sean A. Irvine
 */
public class A066531 extends Sequence1 {

  private final int mWays;
  private long mN = 2519;

  protected A066531(final int ways) {
    mWays = ways;
  }

  /** Construct the sequence. */
  public A066531() {
    this(2);
  }

  private boolean is(final long n) {
    int cnt = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      final long e = n / d;
      if (d >= e && Functions.REVERSE.l(d) == e && ++cnt >= mWays) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
