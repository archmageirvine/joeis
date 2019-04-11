package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017114 <code>a(n) = (8*n + 4)^2</code>.
 * @author Sean A. Irvine
 */
public class A017114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017114() {
    super(new long[] {1, -3, 3}, new long[] {16, 144, 400});
  }
}
