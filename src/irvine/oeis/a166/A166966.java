package irvine.oeis.a166;
// manually 2026-01-12/multia at 2026-01-12 17:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A166966 Eigensequence of A047999, Sierpinski&apos;s gasket.
 * @author Georg Fischer
 */
public class A166966 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A166966() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(Binomial.binomial(n - 1, k).mod(2))), "1");
    next();
  }
}
