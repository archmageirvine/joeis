package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017151 <code>a(n) = (8*n + 7)^3</code>.
 * @author Sean A. Irvine
 */
public class A017151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017151() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 3375, 12167, 29791});
  }
}
