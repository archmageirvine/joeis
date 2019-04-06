package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169738 Base 10 numbers d_1 d_2 ... d_k such that the digits d_i are distinct and not zero, and Sum_{i=1..k-1} d_i^i = d_k^k.
 * @author Georg Fischer
 */
public class A169738 extends FiniteSequence {

  /** Construct the sequence. */
  public A169738() {
    super(42, 93, 253, 712, 6312, 9823, 714523, 781523);
  }
}
