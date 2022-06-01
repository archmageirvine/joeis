package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087452 G.f.: (2-x)/((1+3x)(1-4x)); e.g.f.: exp(4x) + exp(-3x); a(n) = 4^n + (-3)^n.
 * @author Sean A. Irvine
 */
public class A087452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087452() {
    super(new long[] {12, 1}, new long[] {2, 1});
  }
}
