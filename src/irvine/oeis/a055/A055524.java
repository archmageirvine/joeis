package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055524 Longest other side of a Pythagorean triangle with n as length of one of the three sides (in fact n is a leg and <code>a(n)</code> the hypotenuse).
 * @author Sean A. Irvine
 */
public class A055524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055524() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {5, 5, 13, 10, 25, 17});
  }
}
