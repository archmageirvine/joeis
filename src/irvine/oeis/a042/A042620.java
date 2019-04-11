package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042620 Numerators of continued fraction convergents to <code>sqrt(839)</code>.
 * @author Sean A. Irvine
 */
public class A042620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042620() {
    super(new long[] {-1, 0, 0, 0, 1680, 0, 0, 0}, new long[] {28, 29, 811, 840, 47851, 48691, 1362508, 1411199});
  }
}
