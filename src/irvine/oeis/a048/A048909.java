package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048909.
 * @author Sean A. Irvine
 */
public class A048909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048909() {
    super(new long[] {1, -255, 255}, new long[] {1, 325, 82621});
  }
}
