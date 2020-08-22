package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052530 a(n) = 4*a(n-1) - a(n-2), with a(0) = 0, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A052530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052530() {
    super(new long[] {-1, 4}, new long[] {0, 2});
  }
}
