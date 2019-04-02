package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015594 a(n) = 11*a(n-1) + 3*a(n-2).
 * @author Sean A. Irvine
 */
public class A015594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015594() {
    super(new long[] {3, 11}, new long[] {0, 1});
  }
}
