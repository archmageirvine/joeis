package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041016 Numerators of continued fraction convergents to <code>sqrt(12)</code>.
 * @author Sean A. Irvine
 */
public class A041016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041016() {
    super(new long[] {-1, 0, 14, 0}, new long[] {3, 7, 45, 97});
  }
}
