package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-04-25/multrar at 2024-04-25 23:20

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A353165 Expansion of e.g.f. 1/(1 - Sum_{p prime} x^p / (p-1)!).
 * @author Georg Fischer
 */
public class A353165 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A353165() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> (Z.valueOf(k).isProbablePrime() ? Z.ONE : Z.ZERO).multiply(Binomial.binomial(n, k)).multiply(self.a(n - k)).multiply(k)), "1");
  }
}
