package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037655.
 * @author Sean A. Irvine
 */
public class A037655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037655() {
    super(new long[] {-6, 1, 0, 6}, new long[] {3, 18, 110, 663});
  }
}
