package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042240 Numerators of continued fraction convergents to <code>sqrt(646)</code>.
 * @author Sean A. Irvine
 */
public class A042240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042240() {
    super(new long[] {-1, 0, 0, 0, 610, 0, 0, 0}, new long[] {25, 51, 127, 305, 15377, 31059, 77495, 186049});
  }
}
