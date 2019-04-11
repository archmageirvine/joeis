package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042660 Numerators of continued fraction convergents to <code>sqrt(860)</code>.
 * @author Sean A. Irvine
 */
public class A042660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042660() {
    super(new long[] {-1, 0, 0, 0, 7742, 0, 0, 0}, new long[] {29, 88, 1261, 3871, 225779, 681208, 9762691, 29969281});
  }
}
