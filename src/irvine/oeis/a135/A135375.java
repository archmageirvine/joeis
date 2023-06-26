package irvine.oeis.a135;

import irvine.oeis.FiniteSequence;

/**
 * A135375 Smallest prime made up of strings of all first n digits concatenated in ascending order and sandwiched between two 1's.
 * @author Georg Fischer
 */
public class A135375 extends FiniteSequence {

  /** Construct the sequence. */
  public A135375() {
    super(1, FINITE, 101, 10111, 101221, 10001231, 101123441L, 1001233451L, 1012345661L, 101123456671L, 101223456781L, 1012334567891L);
  }
}
