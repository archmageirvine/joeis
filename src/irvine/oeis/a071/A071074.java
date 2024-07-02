package irvine.oeis.a071;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A071074 Sprague-Grundy values for the game of Double Kayles (octal game .7777).
 * @author Sean A. Irvine
 */
public class A071074 extends PrependSequence {

  /** Construct the sequence. */
  public A071074() {
    super(0, new PeriodicSequence(15, 14, 9, 8, 2, 3, 4, 5, 16, 17, 3, 2, 8, 9, 14, 15, 5, 4, 3, 2, 16, 17, 4, 5),
      0, 1, 2, 3, 4, 5, 6, 7, 3, 2, 8, 9, 7, 6, 5, 4, 3, 2, 8, 9, 4, 5, 12, 13, 9, 8, 2, 3, 4, 5, 15, 14, 3, 2, 8, 9, 7, 6, 5, 4, 3, 2, 8, 9, 13, 12, 15, 14, 9, 8, 2, 3, 4, 5, 16, 17, 10, 11, 8, 9, 14, 15, 5, 4, 3, 2, 16, 17, 13, 12, 15, 14, 9, 8, 2, 3, 4, 5, 6, 7, 3, 2, 8, 9, 14, 15, 5, 4, 3, 2, 16, 17, 4, 5, 15, 14, 9, 8, 2, 3, 4, 5, 16, 17, 3, 2, 8, 9, 14, 15, 5, 4, 3, 2, 8, 9, 4, 5, 15, 14, 9, 8, 2, 3, 4, 5, 16, 17, 3, 2, 8, 9, 14, 15, 5, 4, 3, 2, 16, 17, 13, 12);
  }
}
