package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002310.
 * @author Sean A. Irvine
 */
public class A002310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002310() {
    super(new long[] {-1, 5}, new long[] {1, 2});
  }
}
