package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017106 a(n) = (8*n+3)^6.
 * @author Sean A. Irvine
 */
public class A017106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017106() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 1771561, 47045881, 387420489, 1838265625, 6321363049L, 17596287801L});
  }
}
