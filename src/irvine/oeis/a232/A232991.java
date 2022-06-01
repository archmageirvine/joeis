package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232991 Period 6: repeat [1, 0, 0, 0, 1, 0].
 * @author Sean A. Irvine
 */
public class A232991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232991() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0});
  }
}
