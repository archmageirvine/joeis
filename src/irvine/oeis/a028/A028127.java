package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028127.
 * @author Sean A. Irvine
 */
public class A028127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028127() {
    super(new long[] {-2200, 1410, -319, 30}, new long[] {1, 30, 581, 9270});
  }
}
