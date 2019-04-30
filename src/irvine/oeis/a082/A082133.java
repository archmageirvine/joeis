package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082133 Expansion of e.g.f. <code>x*exp(2*x)*cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A082133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082133() {
    super(new long[] {-9, 24, -22, 8}, new long[] {0, 1, 4, 15});
  }
}
