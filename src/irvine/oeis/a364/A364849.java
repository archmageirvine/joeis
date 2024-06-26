package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.oeis.a010.A010551;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A364849 Number of even parity alternating permutations of [1..n] starting with an odd integer.
 * @author Georg Fischer
 */
public class A364849 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A364849() {
    super(1, (self, n) -> self.s(1).divide(2), "1, 1, 1, 1", new A010551(), PREVIOUS);
  }
}
