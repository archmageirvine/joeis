package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145336 Numbers x such that there exists n in N : (x+1)^3-x^3=43*n^2.
 * @author Sean A. Irvine
 */
public class A145336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145336() {
    super(new long[] {1, -33711, 33711}, new long[] {26, 893341, 30114541938L});
  }
}
