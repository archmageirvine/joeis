package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082289.
 * @author Sean A. Irvine
 */
public class A082289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082289() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {2, 9, 26, 59, 116, 206});
  }
}
