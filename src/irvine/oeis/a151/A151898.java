package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151898 First differences of Frobenius numbers for 7 successive numbers <code>A138987</code>.
 * @author Sean A. Irvine
 */
public class A151898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151898() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 9, 2, 2, 2, 2, 2, 16});
  }
}
