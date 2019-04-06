package irvine.oeis.a057;

import irvine.oeis.FiniteSequence;

/**
 * A057694 Chance of holding n-th best poker hand or better is approximately 1/a(n).
 * @author Georg Fischer
 */
public class A057694 extends FiniteSequence {

  /** Construct the sequence. */
  public A057694() {
    super(2, 5, 6, 7, 9, 13, 35, 132, 270, 588);
  }
}
