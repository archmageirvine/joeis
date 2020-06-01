package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087451 G.f.: <code>(2-x)/((1+2x)(1-3x));</code> e.g.f.: <code>exp(3x)+exp(-2x); a(n)=3^n+(-2)^n</code>.
 * @author Sean A. Irvine
 */
public class A087451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087451() {
    super(new long[] {6, 1}, new long[] {2, 1});
  }
}
