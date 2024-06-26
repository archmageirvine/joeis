package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-22/multraf at 2024-04-22 22:28

import irvine.oeis.a007.A007917;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A070600 Largest number with n prime factors where all factors are less than or equal to n.
 * @author Georg Fischer
 */
public class A070600 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A070600() {
    super(1, (self, n) -> self.s(0).pow(n), "0", new A007917());
  }
}
