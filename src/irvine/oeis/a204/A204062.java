package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204062 Expansion of g.f.: exp( Sum_{n&gt;=1} A002203(n)^2 * x^n/n ) where A002203 are the companion Pell numbers.
 * @author Sean A. Irvine
 */
public class A204062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204062() {
    super(new long[] {-1, 4, 10, 4}, new long[] {1, 4, 26, 148});
  }
}
