package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A333983 a(0) = 0; a(n) = 4^(n-1) + (1/n) * Sum_{k=1..n-1} binomial(n,k)^2 * 4^(k-1) * (n-k) * a(n-k).
 * @author Georg Fischer
 */
public class A333983 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A333983() {
    super(0, (self, n) -> Z.FOUR.pow(n - 1).add(Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n, k).square().multiply(Z.FOUR.pow(k - 1)).multiply(n - k).multiply(self.a(n - k))).divide(n)), "0");
  }
}
