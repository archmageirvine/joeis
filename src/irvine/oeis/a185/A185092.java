package irvine.oeis.a185;

import irvine.oeis.FiniteSequence;

/**
 * A185092 Numbers n such that <code>i^i = i^i^i (mod n)</code> for every i.
 * @author Georg Fischer
 */
public class A185092 extends FiniteSequence {

  /** Construct the sequence. */
  public A185092() {
    super(1, 2, 3, 4, 6, 12);
  }
}
