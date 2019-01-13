package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104237.
 * @author Sean A. Irvine
 */
public class A104237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104237() {
    super(new long[] {1, 0, 0, 2, 0, 0, 0, -2}, new long[] {1, -2, 5, -11, 26, -53, 104, -198});
  }
}
