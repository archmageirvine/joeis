package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227137 Positive solutions of the Pell equation <code>x^2 - 89*y^2 = -1</code>. Solutions <code>x = 500*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A227137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227137() {
    super(new long[] {-1, 1000002}, new long[] {1, 1000003});
  }
}
