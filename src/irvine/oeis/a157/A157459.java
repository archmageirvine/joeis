package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157459 Expansion of <code>72*x^2 / (1-323*x+323*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A157459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157459() {
    super(new long[] {1, -323, 323}, new long[] {0, 72, 23256});
  }
}
