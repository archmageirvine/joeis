package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268284 Period 15: repeat {18, 20, 28, 20, 20, 22, 18, 22, 20, 16, 12, 22, 18, 40, 18}.
 * @author Sean A. Irvine
 */
public class A268284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268284() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 20, 28, 20, 20, 22, 18, 22, 20, 16, 12, 22, 18, 40, 18});
  }
}
