package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087451 G.f.: (2-x)/((1+2*x)*(1-3*x)); e.g.f.: exp(3*x) + exp(-2*x); a(n) = 3^n + (-2)^n.
 * @author Sean A. Irvine
 */
public class A087451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087451() {
    super(new long[] {6, 1}, new long[] {2, 1});
  }
}
