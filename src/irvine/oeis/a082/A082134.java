package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082134 Expansion of e.g.f. x*exp(3*x)*cosh(x).
 * @author Sean A. Irvine
 */
public class A082134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082134() {
    super(new long[] {-64, 96, -52, 12}, new long[] {0, 1, 6, 30});
  }
}
