package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-05-24/multraf at 2024-05-24 21:50

import irvine.oeis.a001.A001222;
import irvine.oeis.a007.A007814;
import irvine.oeis.a065.A065339;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A083025 Number of primes congruent to 1 modulo 4 dividing n (with multiplicity).
 * @author Georg Fischer
 */
public class A083025 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A083025() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)).subtract(self.s(2)), "", new A001222(), new A007814(), new A065339());
  }
}
