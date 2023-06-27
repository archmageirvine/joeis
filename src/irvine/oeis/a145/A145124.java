package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145124 Numbers x such that there exists n in N : (x+1)^3-x^3=19*n^2.
 * @author Sean A. Irvine
 */
public class A145124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145124() {
    super(1, new long[] {1, -303, 303}, new long[] {2, 757, 228762});
  }
}
