package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121458.
 * @author Sean A. Irvine
 */
public class A121458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121458() {
    super(new long[] {7, 21, 0}, new long[] {1, 1, 19});
  }
}
