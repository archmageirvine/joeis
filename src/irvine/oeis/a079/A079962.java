package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079962.
 * @author Sean A. Irvine
 */
public class A079962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079962() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 5});
  }
}
