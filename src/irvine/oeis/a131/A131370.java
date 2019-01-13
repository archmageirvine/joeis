package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131370.
 * @author Sean A. Irvine
 */
public class A131370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131370() {
    super(new long[] {2, -3, 3}, new long[] {3, 2, 0});
  }
}
