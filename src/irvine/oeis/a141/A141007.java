package irvine.oeis.a141;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A141007 E.g.f. exp(sum_{d|M} (exp(d*x)-1)/d), M=10.
 * @author Georg Fischer
 */
public class A141007 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A141007() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, j -> self.a(n - j).multiply(Integers.SINGLETON.sumdiv(10, d -> Z.valueOf(d).pow(j - 1))).multiply(Binomial.binomial(n - 1, j - 1))), "1");
  }
}
