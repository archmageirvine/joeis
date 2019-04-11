package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042180 Numerators of continued fraction convergents to <code>sqrt(615)</code>.
 * @author Sean A. Irvine
 */
public class A042180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042180() {
    super(new long[] {-1, 0, 0, 0, 248, 0, 0, 0}, new long[] {24, 25, 99, 124, 6051, 6175, 24576, 30751});
  }
}
