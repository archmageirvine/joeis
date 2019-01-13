package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236583.
 * @author Sean A. Irvine
 */
public class A236583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236583() {
    super(new long[] {1, -1, 0, 3}, new long[] {1, 1, 4, 11});
  }
}
