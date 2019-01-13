package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079957.
 * @author Sean A. Irvine
 */
public class A079957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079957() {
    super(new long[] {1, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1});
  }
}
