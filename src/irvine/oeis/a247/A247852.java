package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247852.
 * @author Sean A. Irvine
 */
public class A247852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247852() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 464, -3104, 39024, 929216, 6211600, 26096544, 83965616});
  }
}
