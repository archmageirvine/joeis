package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131189.
 * @author Sean A. Irvine
 */
public class A131189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131189() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {2, 9, 16, 23, 30, 37, 51});
  }
}
