package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136377 Write down numbers from 0 to 19 around a circle. Start at 1, jump 7; repeat; when you land on a number it is removed.
 * @author Georg Fischer
 */
public class A136377 extends FiniteSequence {

  /** Construct the sequence. */
  public A136377() {
    super(1, 8, 15, 3, 11, 19, 9, 18, 10, 2, 14, 7, 5, 4, 6, 13, 0, 12, 16, 17);
  }
}
