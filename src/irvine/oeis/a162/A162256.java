package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162256.
 * @author Sean A. Irvine
 */
public class A162256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162256() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 15, 45, 98});
  }
}
