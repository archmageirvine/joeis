package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042908 Numerators of continued fraction convergents to <code>sqrt(986)</code>.
 * @author Sean A. Irvine
 */
public class A042908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042908() {
    super(new long[] {1, 0, 0, 314, 0, 0}, new long[] {31, 63, 157, 9797, 19751, 49299});
  }
}
