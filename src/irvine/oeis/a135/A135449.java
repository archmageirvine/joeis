package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135449 Period 5: repeat 1, 9, -7, 3, 5.
 * @author Sean A. Irvine
 */
public class A135449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135449() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 9, -7, 3, 5});
  }
}
