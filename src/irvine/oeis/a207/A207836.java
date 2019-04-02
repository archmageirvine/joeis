package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207836 a(n) = n*A052530(n)/2.
 * @author Sean A. Irvine
 */
public class A207836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207836() {
    super(new long[] {-1, 8, -18, 8}, new long[] {0, 3, 16, 75});
  }
}
