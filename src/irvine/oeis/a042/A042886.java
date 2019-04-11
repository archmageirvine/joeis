package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042886 Numerators of continued fraction convergents to <code>sqrt(975)</code>.
 * @author Sean A. Irvine
 */
public class A042886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042886() {
    super(new long[] {-1, 0, 0, 0, 2498, 0, 0, 0}, new long[] {31, 125, 281, 1249, 77719, 312125, 701969, 3120001});
  }
}
