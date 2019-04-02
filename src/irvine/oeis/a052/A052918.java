package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052918 a(0) = 1, a(1) = 5, a(n+1) = 5*a(n) + a(n-1).
 * @author Sean A. Irvine
 */
public class A052918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052918() {
    super(new long[] {1, 5}, new long[] {1, 5});
  }
}
