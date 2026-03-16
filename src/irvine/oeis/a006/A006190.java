package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A006190 a(n) = 3*a(n-1) + a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A006190 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A006190() {
    super(0, new long[] {1, 3}, new long[] {0, 1});
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    // a(n) = Sum_{k=0..n-1} binomial(n-k-1,k)*3^(n-2*k-1)
    return n <= 1 ? Z.valueOf(n) : Rationals.SINGLETON.sum(0, n - 1, k -> Q.THREE.pow(n - 2 * k - 1).multiply(Binomial.binomial(n - k - 1, k))).num();
  }

}
