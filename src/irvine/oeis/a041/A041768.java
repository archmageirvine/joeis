package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041768 Numerators of continued fraction convergents to <code>sqrt(405)</code>.
 * @author Sean A. Irvine
 */
public class A041768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041768() {
    super(new long[] {-1, 0, 322, 0}, new long[] {20, 161, 6460, 51841});
  }
}
