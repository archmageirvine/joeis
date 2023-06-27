package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145307 Numbers x such that there exists n in N : (x+79)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145307() {
    super(1, new long[] {1, -456303, 456303}, new long[] {7663, 3514673818L, 1603752710517223L});
  }
}
