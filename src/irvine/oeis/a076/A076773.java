package irvine.oeis.a076;

import irvine.math.function.Function1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076773 2-nadirs of phi: numbers k such that phi(k-2) &gt; phi(k-1) &gt; phi(k) &lt; phi(k+1) &lt; phi(k+2).
 * @author Sean A. Irvine
 */
public class A076773 extends Sequence1 {

  private final long mDelta;
  private final Function1 mFunction;
  private long mN = 0;

  protected A076773(final long delta, final Function1 fn) {
    mDelta = delta;
    mFunction = fn;
  }

  /** Construct the sequence. */
  public A076773() {
    this(2, Functions.PHI);
  }

  private boolean is(final long n) {
    for (long k = mDelta; k > 0; --k) {
      final Z a = mFunction.z(n - k);
      final Z b = mFunction.z(n - k + 1);
      if (a.compareTo(b) <= 0) {
        return false;
      }
    }
    for (long k = mDelta; k > 0; --k) {
      final Z a = mFunction.z(n + k);
      final Z b = mFunction.z(n + k - 1);
      if (a.compareTo(b) <= 0) {
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
