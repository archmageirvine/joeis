package irvine.oeis.a261;
// Generated by gen_seq4.pl 2024-06-25/multraf at 2024-06-25 23:40

import irvine.oeis.a000.A000041;
import irvine.oeis.a034.A034899;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A261043 Number of multisets of nonempty words with a total of n letters over binary alphabet such that all letters occur at least once in the multiset.
 * @author Georg Fischer
 */
public class A261043 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A261043() {
    super(0, (self, n) -> self.s(0).subtract(self.s(1).multiply(2)), "0, 0", new A034899(), new A000041());
  }
}
