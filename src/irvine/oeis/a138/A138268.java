package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138268.
 * @author Sean A. Irvine
 */
public class A138268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138268() {
    super(new long[] {-1, -3, -8, -3}, new long[] {1, 4, -17, 17});
  }
}
