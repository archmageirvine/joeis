package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213472 Period 20, repeat 1, 4, 0, 9, 1, 6, 4, 5, 9, 6, 6, 9, 5, 4, 6, 1, 9, 0, 4, 1.
 * @author Sean A. Irvine
 */
public class A213472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213472() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 4, 0, 9, 1, 6, 4, 5, 9, 6, 6, 9, 5, 4, 6});
  }
}
