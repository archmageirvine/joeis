package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048736 Dana Scott's sequence: a(n) = (a(n-2) + a(n-1) * a(n-3)) / a(n-4), a(0) = a(1) = a(2) = a(3) = 1.
 * @author Sean A. Irvine
 */
public class A048736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048736() {
    super(new long[] {1, 0, 0, -10, 0, 0, 10, 0, 0}, new long[] {1, 1, 1, 1, 2, 3, 5, 13, 22});
  }
}
