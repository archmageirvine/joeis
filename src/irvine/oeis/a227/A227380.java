package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227380.
 * @author Sean A. Irvine
 */
public class A227380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227380() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 2, 2, 3, 8, 10});
  }
}
