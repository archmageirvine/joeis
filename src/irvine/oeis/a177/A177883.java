package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177883 Period 6: repeat [4, 5, 7, 2, 1, 8].
 * @author Sean A. Irvine
 */
public class A177883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177883() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {4, 5, 7, 2, 1, 8});
  }
}
