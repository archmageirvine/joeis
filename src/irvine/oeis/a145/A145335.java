package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145335 Numbers n such that there exists x in N : (x+1)^3-x^3=43*n^2.
 * @author Sean A. Irvine
 */
public class A145335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145335() {
    super(new long[] {-1, 33710}, new long[] {7, 235963});
  }
}
