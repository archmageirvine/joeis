package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135694 Period 6: repeat [1, -1, -1, -1, 0, 2].
 * @author Sean A. Irvine
 */
public class A135694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135694() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, -1, -1, -1});
  }
}
