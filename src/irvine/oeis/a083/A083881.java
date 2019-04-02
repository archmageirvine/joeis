package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083881 a(0)=1, a(1)=3, a(n) = 6a(n-1) - 6a(n-2), n&gt;=2.
 * @author Sean A. Irvine
 */
public class A083881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083881() {
    super(new long[] {-6, 6}, new long[] {1, 3});
  }
}
