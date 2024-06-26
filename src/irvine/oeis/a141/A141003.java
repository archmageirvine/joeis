package irvine.oeis.a141;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A141003 Expansion of e.g.f. exp(Sum_{d|M} (exp(d*x)-1)/d), M=4.
 * @author Georg Fischer
 */
public class A141003 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A141003() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, j -> self.a(n - j).multiply(Integers.SINGLETON.sumdiv(4, d -> Z.valueOf(d).pow(j - 1))).multiply(Binomial.binomial(n - 1, j - 1))), "1");
  }
}
