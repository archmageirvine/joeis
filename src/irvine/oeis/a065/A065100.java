package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065100 a(n+2) = 9*a(n+1) - a(n), a(0) = 3, a(1) = 27.
 * @author Sean A. Irvine
 */
public class A065100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065100() {
    super(new long[] {-1, 9}, new long[] {3, 27});
  }
}
