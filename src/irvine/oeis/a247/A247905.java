package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247905.
 * @author Sean A. Irvine
 */
public class A247905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247905() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 7, 19, 43});
  }
}
