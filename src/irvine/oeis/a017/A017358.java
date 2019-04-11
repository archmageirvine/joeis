package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017358 <code>a(n) = (10*n + 7)^6</code>.
 * @author Sean A. Irvine
 */
public class A017358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017358() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {117649, 24137569, 387420489, 2565726409L, 10779215329L, 34296447249L, 90458382169L});
  }
}
