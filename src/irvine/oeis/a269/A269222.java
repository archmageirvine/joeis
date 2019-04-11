package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269222 Period 4: repeat <code>[1,9,8,9]</code>.
 * @author Sean A. Irvine
 */
public class A269222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269222() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 9, 8, 9});
  }
}
