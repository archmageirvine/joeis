package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042232 Numerators of continued fraction convergents to <code>sqrt(642)</code>.
 * @author Sean A. Irvine
 */
public class A042232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042232() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 11554, 0, 0, 0, 0, 0}, new long[] {25, 51, 76, 1875, 1951, 5777, 290801, 587379, 878180, 21663699, 22541879, 66747457});
  }
}
