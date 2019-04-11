package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017104 <code>a(n) = (8*n+3)^4</code>.
 * @author Sean A. Irvine
 */
public class A017104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017104() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 14641, 130321, 531441, 1500625});
  }
}
