package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236579.
 * @author Sean A. Irvine
 */
public class A236579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236579() {
    super(new long[] {-1, 4, -6, 6}, new long[] {1, 3, 15, 75});
  }
}
