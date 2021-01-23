package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022319 a(n) = a(n-1) + a(n-2) + 1 for n &gt; 1, a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A022319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022319() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 7});
  }
}
