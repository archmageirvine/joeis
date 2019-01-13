package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028123.
 * @author Sean A. Irvine
 */
public class A028123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028123() {
    super(new long[] {-1920, 1264, -296, 29}, new long[] {1, 29, 545, 8485});
  }
}
