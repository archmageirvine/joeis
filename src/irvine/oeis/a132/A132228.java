package irvine.oeis.a132;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A132228 a(n) = Sum_{k=0..n} C(n-1,k)^2*a(k)*a(n-k-1) for n&gt;0 with a(0)=1.
 * @author Georg Fischer
 */
public class A132228 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A132228() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(self.a(n - k - 1).multiply(Binomial.binomial(n - 1, k).square()))), "1");
  }
}
