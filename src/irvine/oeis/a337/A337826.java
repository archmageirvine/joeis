package irvine.oeis.a337;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A337826 a(0) = 1; a(n) = (1/n) * Sum_{k=1..n} binomial(n,k)^2 * k^4 * a(n-k).
 * @author Georg Fischer
 */
public class A337826 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A337826() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n, k).square().multiply(Z.valueOf(k).pow(4)).multiply(self.a(n - k))).divide(n), "1");
  }
}
