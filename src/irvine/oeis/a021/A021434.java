package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021434.
 * @author Sean A. Irvine
 */
public class A021434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021434() {
    super(new long[] {-120, 199, -95, 17}, new long[] {1, 17, 194, 1882});
  }
}
