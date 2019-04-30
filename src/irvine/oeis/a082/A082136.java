package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082136 Expansion of e.g.f. <code>x*exp(5*x)*cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A082136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082136() {
    super(new long[] {-576, 480, -148, 20}, new long[] {0, 1, 10, 78});
  }
}
