package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a187.A187795;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A294889 Sum of abundant proper divisors of n.
 * @author Georg Fischer
 */
public class A294889 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A294889() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1).multiply(n)), "", new A187795(), new A294937());
  }
}
