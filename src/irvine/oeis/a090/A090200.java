package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090200 a(n) = N(7,n), where N(7,x) is the 7th Narayana polynomial.
 * @author Sean A. Irvine
 */
public class A090200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090200() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 429, 4279, 20071, 65445, 171481, 387739});
  }
}
