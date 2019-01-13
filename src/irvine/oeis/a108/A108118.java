package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108118.
 * @author Sean A. Irvine
 */
public class A108118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108118() {
    super(new long[] {-1, 2, -1, -1, 2}, new long[] {1, 2, 5, 7, 10});
  }
}
