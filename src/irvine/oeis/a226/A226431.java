package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226431.
 * @author Sean A. Irvine
 */
public class A226431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226431() {
    super(new long[] {-2, 15, -41, 51, -31, 9}, new long[] {1, 2, 6, 21, 73, 244});
  }
}
