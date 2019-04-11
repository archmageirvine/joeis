package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078112 Coefficients <code>a(n)</code> in the unique expansion sin(1) = Sum[a(n)/n!, <code>n&gt;=1],</code> where <code>a(n)</code> satisfies <code>0&lt;=a(n)&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A078112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078112() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 2, 0, 0, 5});
  }
}
