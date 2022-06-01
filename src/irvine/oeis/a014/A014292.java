package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014292 a(n) = 2*a(n-1) - a(n-2) - a(n-4) with a(0) = a(1) = 0, a(2) = 1, a(3) = 2.
 * @author Sean A. Irvine
 */
public class A014292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014292() {
    super(new long[] {-1, 0, -1, 2}, new long[] {0, 0, 1, 2});
  }
}

