package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145309 Numbers x such that there exists n in N : (x+1)^3-x^3=79*n^2.
 * @author Sean A. Irvine
 */
public class A145309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145309() {
    super(new long[] {1, -456303, 456303}, new long[] {97, 44489542, 20300667221737L});
  }
}
