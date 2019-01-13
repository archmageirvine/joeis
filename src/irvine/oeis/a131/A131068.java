package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131068.
 * @author Sean A. Irvine
 */
public class A131068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131068() {
    super(new long[] {2, -5, 4}, new long[] {1, 2, 10});
  }
}
