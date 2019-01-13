package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021664.
 * @author Sean A. Irvine
 */
public class A021664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021664() {
    super(new long[] {-264, 409, -167, 23}, new long[] {1, 23, 362, 4894});
  }
}
