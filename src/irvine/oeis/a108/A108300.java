package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108300 a(n+2) = 3*a(n+1) + a(n), with a(0) = 1, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A108300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108300() {
    super(new long[] {1, 3}, new long[] {1, 5});
  }
}
