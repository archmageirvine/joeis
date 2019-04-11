package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042804 Numerators of continued fraction convergents to <code>sqrt(933)</code>.
 * @author Sean A. Irvine
 */
public class A042804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042804() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 150526, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 61, 336, 6781, 34241, 41022, 75263, 4556802, 4632065, 9188867, 50576400, 1020716867, 5154160735L, 6174877602L, 11329038337L});
  }
}
