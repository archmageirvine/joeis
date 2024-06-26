package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-05-29/multrar at 2024-05-29 02:16

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A351343 G.f. A(x) satisfies: A(x) = 1 + x + x^2 + x^3 + x^4 * A(x/(1 - 2*x)) / (1 - 2*x).
 * @author Georg Fischer
 */
public class A351343 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A351343() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 4, k -> Binomial.binomial(n - 4, k).multiply(self.a(n - k - 4)).multiply(Z.TWO.pow(k))), "1, 1, 1, 1, 1");
  }
}
