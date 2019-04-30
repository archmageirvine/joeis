package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082308 Expansion of e.g.f. <code>(1+x)*exp(4*x)*cosh(x)</code>.
 * @author Sean A. Irvine
 */
public class A082308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082308() {
    super(new long[] {-225, 240, -94, 16}, new long[] {1, 5, 25, 127});
  }
}
