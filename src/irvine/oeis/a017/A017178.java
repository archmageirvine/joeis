package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017178 (9n+1)^6.
 * @author Sean A. Irvine
 */
public class A017178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017178() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1000000, 47045881, 481890304, 2565726409L, 9474296896L, 27680640625L});
  }
}
