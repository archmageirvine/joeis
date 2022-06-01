package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082306 Expansion of e.g.f. (1+x)*exp(2*x)*cosh(x).
 * @author Sean A. Irvine
 */
public class A082306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082306() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 3, 9, 29});
  }
}
