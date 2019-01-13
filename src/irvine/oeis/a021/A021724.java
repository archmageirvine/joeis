package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021724.
 * @author Sean A. Irvine
 */
public class A021724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021724() {
    super(new long[] {-360, 546, -211, 26}, new long[] {1, 26, 465, 7150});
  }
}
