package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078112 Coefficients a(n) in the unique expansion sin(1) = Sum[a(n)/n!, n&gt;=1], where a(n) satisfies 0&lt;=a(n)&lt;n.
 * @author Sean A. Irvine
 */
public class A078112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078112() {
    super(1, new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 2, 0, 0, 5});
  }
}
