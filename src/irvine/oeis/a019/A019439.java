package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019439 Number of ways of tiling a 2 X n rectangle with dominoes and trominoes.
 * @author Sean A. Irvine
 */
public class A019439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019439() {
    super(new long[] {-1, 1, 2, 3, 0, 2}, new long[] {1, 2, 6, 17, 43, 108});
  }
}
