package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082307 Expansion of e.g.f. (1+x)*exp(3*x)*cosh(x).
 * @author Sean A. Irvine
 */
public class A082307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082307() {
    super(new long[] {-64, 96, -52, 12}, new long[] {1, 4, 16, 66});
  }
}
