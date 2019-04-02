package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240826 Number of ways to choose three points on a centered hexagonal grid of size n.
 * @author Sean A. Irvine
 */
public class A240826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240826() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 35, 969, 7770, 35990, 121485, 333375});
  }
}
