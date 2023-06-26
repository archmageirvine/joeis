package irvine.oeis.a127;

import irvine.oeis.FiniteSequence;

/**
 * A127834 Numbers whose 8-bit binary representation, when rotated by up to one bit, contains every 3-bit binary representation for the numbers 0 through 7. When this binary representation, with two bits from one end concatenated to the other, is given as input to an elementary cellular automaton, the first line of output will uniquely identify the rule of the automaton.
 * @author Georg Fischer
 */
public class A127834 extends FiniteSequence {

  /** Construct the sequence. */
  public A127834() {
    super(1, FINITE, 23, 29, 46, 58, 71, 92, 113, 116, 139, 142, 163, 184, 197, 209, 226, 232);
  }
}
