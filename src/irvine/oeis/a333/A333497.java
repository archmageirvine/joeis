package irvine.oeis.a333;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A333497 a(0) = a(1) = a(2) = 1; a(n) = Sum_{k=0..n-3} binomial(n-3,k) * a(k) * a(n-k-3).
 * @author Georg Fischer
 */
public class A333497 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A333497() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 3, k -> Binomial.binomial(n - 3, k).multiply(self.a(n - k - 3)).multiply(self.a(k))), "1,1,1");
  }
}
