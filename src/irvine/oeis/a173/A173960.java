package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173960.
 * @author Sean A. Irvine
 */
public class A173960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173960() {
    super(new long[] {1, -3, 3}, new long[] {21, 41, 69});
  }
}
