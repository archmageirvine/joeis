package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122999 G.f.: 1/(1 - x - 25*x^2).
 * @author Sean A. Irvine
 */
public class A122999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122999() {
    super(new long[] {25, 1}, new long[] {1, 1});
  }
}
