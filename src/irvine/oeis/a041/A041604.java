package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041604 Numerators of continued fraction convergents to <code>sqrt(320)</code>.
 * @author Sean A. Irvine
 */
public class A041604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041604() {
    super(new long[] {-1, 0, 0, 0, 322, 0, 0, 0}, new long[] {17, 18, 143, 161, 5617, 5778, 46063, 51841});
  }
}
