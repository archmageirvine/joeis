package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007800 From a problem in AI planning: a(n) = 4+a(n-1)+a(n-2)+a(n-3)+a(n-4)-a(n-5)-a(n-6)-a(n-7), n&gt;7.
 * @author Sean A. Irvine
 */
public class A007800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007800() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {1, 2, 4, 8, 16});
  }
}

