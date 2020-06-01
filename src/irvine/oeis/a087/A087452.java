package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087452 G.f.: <code>(2-x)/((1+3x)(1-4x));</code> e.g.f.: <code>exp(4x) + exp(-3x); a(n) = 4^n + (-3)^n</code>.
 * @author Sean A. Irvine
 */
public class A087452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087452() {
    super(new long[] {12, 1}, new long[] {2, 1});
  }
}
