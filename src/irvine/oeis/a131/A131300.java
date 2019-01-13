package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131300.
 * @author Sean A. Irvine
 */
public class A131300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131300() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 3, 7});
  }
}
