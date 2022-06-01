package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187078 38 followed by n ones.
 * @author Sean A. Irvine
 */
public class A187078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187078() {
    super(new long[] {-10, 11}, new long[] {38, 381});
  }
}
