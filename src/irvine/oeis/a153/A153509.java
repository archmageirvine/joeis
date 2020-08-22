package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153509 Period 9: repeat [6, 6, 6, 3, 3, 3, 0, 0, 0].
 * @author Sean A. Irvine
 */
public class A153509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153509() {
    super(new long[] {1, -1, 0, 1, -1, 0, 1}, new long[] {6, 6, 6, 3, 3, 3, 0});
  }
}
