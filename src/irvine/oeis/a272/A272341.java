package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272341 Numbers n such that 6^n is not of the form (x^3 + y^3 + z^3) / 3 where x &gt; y &gt; z &gt; 0.
 * @author Georg Fischer
 */
public class A272341 extends FiniteSequence {

  /** Construct the sequence. */
  public A272341() {
    super(0, 1, 2, 3, 5, 6, 8, 9, 12, 15);
  }
}
