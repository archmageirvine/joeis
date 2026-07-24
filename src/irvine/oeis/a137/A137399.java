package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137399 a(0) = 1, a(1) = a(2) = 2, a(3) = 1, and a(n) = 4*a(n-4) for n &gt; 3.
 * @author Sean A. Irvine
 */
public class A137399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137399() {
    super(new long[] {4, 0, 0, 0}, new long[] {1, 2, 2, 1});
  }
}
