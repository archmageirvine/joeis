package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-04-17/partsun at 2024-04-17 19:29

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a171.A171970;

/**
 * A194082 Sum{floor(sqrt(3)*k/2) : 1&lt;=k&lt;=n}.
 * @author Georg Fischer
 */
public class A194082 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194082() {
    super(1, new A171970());
  }
}
