package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032525 Floor( 7*n^2/2 ).
 * @author Sean A. Irvine
 */
public class A032525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032525() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 14, 31});
  }
}
