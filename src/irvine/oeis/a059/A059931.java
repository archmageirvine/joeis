package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059931 Numbers n such that n and <code>n^(1/2)</code> combined use different digits.
 * @author Georg Fischer
 */
public class A059931 extends FiniteSequence {

  /** Construct the sequence. */
  public A059931() {
    super(4, 9, 16, 49, 64, 81, 289, 324, 576, 841, 2809, 2916, 3249, 3481, 5184, 6241, 7056, 43681, 67081, 321489, 651249, 729316);
  }
}
