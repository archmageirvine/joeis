package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017104 a(n) = (8*n+3)^4.
 * @author Sean A. Irvine
 */
public class A017104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017104() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 14641, 130321, 531441, 1500625});
  }
}
