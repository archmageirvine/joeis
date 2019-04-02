package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145212 Numbers x such that there exists n in N : (x+1)^3 - x^3 = 67*n^2.
 * @author Sean A. Irvine
 */
public class A145212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145212() {
    super(new long[] {1, -1030191, 1030191}, new long[] {146, 150922981, 155479346311338L});
  }
}
