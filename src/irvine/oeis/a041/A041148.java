package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041148 Numerators of continued fraction convergents to <code>sqrt(84)</code>.
 * @author Sean A. Irvine
 */
public class A041148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041148() {
    super(new long[] {-1, 0, 110, 0}, new long[] {9, 55, 999, 6049});
  }
}
