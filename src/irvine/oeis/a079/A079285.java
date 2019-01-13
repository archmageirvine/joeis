package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079285.
 * @author Sean A. Irvine
 */
public class A079285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079285() {
    super(new long[] {-2, -2, 3, 1}, new long[] {0, 2, 1, 5});
  }
}
