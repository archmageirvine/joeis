package irvine.oeis.a002;

import java.util.Iterator;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002487 Stern's diatomic series (or Stern-Brocot sequence): a(0) = 0, a(1) = 1; for n &gt; 0: a(2*n) = a(n), a(2*n+1) = a(n) + a(n+1).
 * @author Sean A. Irvine
 */
public class A002487 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A002487() {
    super(0);
  }

  private final Iterator<Q> mIt = Rationals.SINGLETON.iterator();

  @Override
  public Z next() {
    return mIt.next().num();
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    long sum = 0;
    for (long k = 0; k <= (n - 1) / 2; ++k) {
      sum += Binomial.binomial(n - k - 1, k, 2);
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }
}
