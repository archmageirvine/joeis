package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055524 Longest other side of a Pythagorean triangle with n as length of one of the three sides (in fact n is a leg and a(n) the hypotenuse).
 * @author Sean A. Irvine
 */
public class A055524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055524() {
    super(3, new long[] {1, 0, -3, 0, 3, 0}, new long[] {5, 5, 13, 10, 25, 17});
  }
}
