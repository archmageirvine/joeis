package irvine.oeis.a105;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A105995 Fibonacci sequence (mod 14).
 * @author Georg Fischer
 */
public class A105995 extends PeriodicSequence {

  /** Construct the sequence. */
  public A105995() {
    super(0, 1, 1, 2, 3, 5, 8, 13, 7, 6, 13, 5, 4, 9, 13, 8, 7, 1, 8, 9, 3, 12, 1, 13,
      0, 13, 13, 12, 11, 9, 6, 1, 7, 8, 1, 9, 10, 5, 1, 6, 7, 13, 6, 5, 11, 2, 13, 1);
  }
}
