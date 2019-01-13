package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236576.
 * @author Sean A. Irvine
 */
public class A236576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236576() {
    super(new long[] {1, -3, 6}, new long[] {1, 4, 22});
  }
}
