package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157459 Expansion of 72*x^2 / (1 - 323*x + 323*x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A157459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157459() {
    super(new long[] {1, -323, 323}, new long[] {0, 72, 23256});
  }
}
