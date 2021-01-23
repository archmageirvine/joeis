package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018913 a(n) = 9*a(n - 1) - a(n - 2) for n&gt;1, a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A018913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018913() {
    super(new long[] {-1, 9}, new long[] {0, 1});
  }
}
