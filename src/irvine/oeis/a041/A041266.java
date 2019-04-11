package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041266 Numerators of continued fraction convergents to <code>sqrt(146)</code>.
 * @author Sean A. Irvine
 */
public class A041266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041266() {
    super(new long[] {-1, 0, 290, 0}, new long[] {12, 145, 3492, 42049});
  }
}
