package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125905 a(0) = 1, a(1) = -4, a(n) = -4*a(n-1) - a(n-2) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A125905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125905() {
    super(new long[] {-1, -4}, new long[] {1, -4});
  }
}
