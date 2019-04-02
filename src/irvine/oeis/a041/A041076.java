package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041076 Numerators of continued fraction convergents to sqrt(45).
 * @author Sean A. Irvine
 */
public class A041076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041076() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 322, 0, 0, 0, 0, 0}, new long[] {6, 7, 20, 47, 114, 161, 2046, 2207, 6460, 15127, 36714, 51841});
  }
}
