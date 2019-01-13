package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236652.
 * @author Sean A. Irvine
 */
public class A236652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236652() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 4, 9, 10, 18, 19});
  }
}
