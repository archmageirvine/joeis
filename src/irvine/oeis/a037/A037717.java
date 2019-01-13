package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037717.
 * @author Sean A. Irvine
 */
public class A037717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037717() {
    super(new long[] {-5, 6, -6, 6}, new long[] {2, 10, 51, 258});
  }
}
