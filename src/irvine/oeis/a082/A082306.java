package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082306 Expansion of e.g.f. <code>(1+x)*exp(2*x)*cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A082306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082306() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 3, 9, 29});
  }
}
