package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082309 Expansion of e.g.f.: <code>(1+x)*exp(5*x)*cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A082309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082309() {
    super(new long[] {-576, 480, -148, 20}, new long[] {1, 6, 36, 218});
  }
}
