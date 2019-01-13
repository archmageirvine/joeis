package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281362.
 * @author Sean A. Irvine
 */
public class A281362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281362() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 2, 4, 7, 13});
  }
}
