package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052913 a(n+2) = 5*a(n+1) - 2*a(n), with a(0) = 1, a(1) = 4.
 * @author Sean A. Irvine
 */
public class A052913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052913() {
    super(new long[] {-2, 5}, new long[] {1, 4});
  }
}
