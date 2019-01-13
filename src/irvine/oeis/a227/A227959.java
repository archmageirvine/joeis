package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227959.
 * @author Sean A. Irvine
 */
public class A227959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227959() {
    super(new long[] {4, 2, 2, 4, 0}, new long[] {1, 1, 4, 6, 20});
  }
}
