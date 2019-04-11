package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018913 <code>a(n) = 9*a(n - 1) - a(n - 2)</code> for <code>n&gt;1, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A018913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018913() {
    super(new long[] {-1, 9}, new long[] {0, 1});
  }
}
