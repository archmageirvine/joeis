package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037648.
 * @author Sean A. Irvine
 */
public class A037648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037648() {
    super(new long[] {-6, 1, 0, 6}, new long[] {3, 18, 109, 657});
  }
}
