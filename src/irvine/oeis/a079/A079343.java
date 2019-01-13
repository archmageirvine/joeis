package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079343.
 * @author Sean A. Irvine
 */
public class A079343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079343() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 2, 3});
  }
}
