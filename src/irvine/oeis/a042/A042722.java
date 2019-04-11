package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042722 Numerators of continued fraction convergents to <code>sqrt(891)</code>.
 * @author Sean A. Irvine
 */
public class A042722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042722() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7940, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 30, 179, 209, 388, 597, 3373, 3970, 233633, 237603, 1421648, 1659251, 3080899, 4740150, 26781649, 31521799});
  }
}
