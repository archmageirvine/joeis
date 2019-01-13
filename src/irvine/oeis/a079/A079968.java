package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079968.
 * @author Sean A. Irvine
 */
public class A079968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079968() {
    super(new long[] {1, 1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 14});
  }
}
