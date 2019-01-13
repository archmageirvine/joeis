package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090197.
 * @author Sean A. Irvine
 */
public class A090197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090197() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 45, 100});
  }
}
