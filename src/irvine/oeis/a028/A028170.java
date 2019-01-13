package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028170.
 * @author Sean A. Irvine
 */
public class A028170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028170() {
    super(new long[] {-2160, 1302, -289, 28}, new long[] {1, 28, 495, 7070});
  }
}
