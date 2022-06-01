package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233656 a(n) = 3*a(n-1) - 2*(n-1), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A233656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233656() {
    super(new long[] {3, -7, 5}, new long[] {1, 3, 7});
  }
}
