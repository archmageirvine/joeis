package irvine.oeis.a181;

import irvine.oeis.FiniteSequence;

/**
 * A181447 Numbers n such that 3 is the largest prime factor of <code>n^2 - 1</code>.
 * @author Georg Fischer
 */
public class A181447 extends FiniteSequence {

  /** Construct the sequence. */
  public A181447() {
    super(2, 5, 7, 17);
  }
}
