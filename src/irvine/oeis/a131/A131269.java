package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131269.
 * @author Sean A. Irvine
 */
public class A131269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131269() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 3, 6});
  }
}
