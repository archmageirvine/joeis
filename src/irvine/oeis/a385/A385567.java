package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a386.A386728;

/**
 * A385567 Triangle read by rows: T(n,k) is the numerator of A(n,k), such that A(n,k) satisfies the identity for sums of odd powers: Sum_{k=1..p} k^(2n-1) = 1/(2*n) * Sum_{k=0..n-1} A(n,k) * (p^2+p)^(n-k), for all integers p &gt;= 1.
 * @author Sean A. Irvine
 */
public class A385567 extends A386728 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
