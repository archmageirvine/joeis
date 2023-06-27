package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274972 Numbers x such that there exists n in N : (x+1)^3 - x^3 = 61*n^2.
 * @author Sean A. Irvine
 */
public class A274972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274972() {
    super(1, new long[] {1, -975, 975}, new long[] {4, 4387, 4273420});
  }
}
