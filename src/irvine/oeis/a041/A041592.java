package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041592 Numerators of continued fraction convergents to <code>sqrt(314)</code>.
 * @author Sean A. Irvine
 */
public class A041592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041592() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 886, 0, 0, 0, 0, 0, 0}, new long[] {17, 18, 53, 71, 124, 319, 443, 15381, 15824, 47029, 62853, 109882, 282617, 392499});
  }
}
