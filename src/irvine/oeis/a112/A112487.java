package irvine.oeis.a112;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A112487 a(n) = Sum_{k=0..n} E2(n, k)*2^k, where E2(n, k) are the second-order Eulerian numbers A340556.
 * @author Georg Fischer
 */
public class A112487 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A112487() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(self.a(k)).multiply(self.a(n - k - 1))).add(self.a(n - 1).multiply(n)), "1");
  }
}
