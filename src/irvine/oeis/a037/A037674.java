package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037674.
 * @author Sean A. Irvine
 */
public class A037674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037674() {
    super(new long[] {-4, 5, -5, 5}, new long[] {1, 4, 18, 75});
  }
}
