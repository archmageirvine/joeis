package irvine.oeis.a076;

import irvine.math.function.Function1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076759 2-apexes of Omega: numbers k such that Omega(k-2)&lt; Omega(k-1) &lt; Omega(k) &gt; Omega(k+1) &gt; Omega(k+2), where Omega(m) = the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076759 extends Sequence1 {

  private final long mDelta;
  private final Function1 mFunction;
  private long mN = 0;

  protected A076759(final long delta, final Function1 fn) {
    mDelta = delta;
    mFunction = fn;
  }

  /** Construct the sequence. */
  public A076759() {
    this(2, Functions.BIG_OMEGA);
  }

  private boolean is(final long n) {
    for (long k = mDelta; k > 0; --k) {
      final long a = mFunction.l(n - k);
      final long b = mFunction.l(n - k + 1);
      if (a >= b) {
        return false;
      }
    }
    for (long k = mDelta; k > 0; --k) {
      final long a = mFunction.l(n + k);
      final long b = mFunction.l(n + k - 1);
      if (a >= b) {
        return false;
      }
    }
    return true;
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
