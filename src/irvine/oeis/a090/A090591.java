package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090591 Expansion of g.f.: 1/(1 - 2*x + 8*x^2).
 * @author Sean A. Irvine
 */
public class A090591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090591() {
    super(new long[] {-8, 2}, new long[] {1, 2});
  }
}
