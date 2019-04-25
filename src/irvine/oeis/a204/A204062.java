package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204062 G.f.: exp( <code>Sum_{n&gt;=1}</code> A002203(n)^2 <code>* x^n/n )</code> where A002203 are the companion Pell numbers.
 * @author Sean A. Irvine
 */
public class A204062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204062() {
    super(new long[] {-1, 4, 10, 4}, new long[] {1, 4, 26, 148});
  }
}
