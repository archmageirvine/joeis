package irvine.oeis.a256;
// Generated by gen_seq4.pl 2024-08-04/multrar at 2024-08-04 18:23

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A256006 Recurrence: a(n) = Sum_{k=0..n-1} a(k)*C(n+1,k), a(0)=1.
 * @author Georg Fischer
 */
public class A256006 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A256006() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(Binomial.binomial(n + 1, k))), "1");
  }
}
