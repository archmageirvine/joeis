package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152262 a(n) = 14*a(n-1) - 43*a(n-2), n &gt; 1; a(0)=1, a(1)=7.
 * @author Sean A. Irvine
 */
public class A152262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152262() {
    super(new long[] {-43, 14}, new long[] {1, 7});
  }
}
