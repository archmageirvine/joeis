package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095311 47-gonal numbers.
 * @author Sean A. Irvine
 */
public class A095311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095311() {
    super(new long[] {1, -3, 3}, new long[] {1, 47, 138});
  }
}
