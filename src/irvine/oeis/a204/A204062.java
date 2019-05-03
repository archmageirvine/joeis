package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204062 G.f.: <code>exp( Sum_{n&gt;=1} A002203(n)^2 * x^n/n )</code> where <code>A002203</code> are the companion Pell numbers.
 * @author Sean A. Irvine
 */
public class A204062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204062() {
    super(new long[] {-1, 4, 10, 4}, new long[] {1, 4, 26, 148});
  }
}
