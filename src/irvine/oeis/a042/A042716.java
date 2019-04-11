package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042716 Numerators of continued fraction convergents to <code>sqrt(888)</code>.
 * @author Sean A. Irvine
 */
public class A042716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042716() {
    super(new long[] {-1, 0, 0, 0, 298, 0, 0, 0}, new long[] {29, 30, 119, 149, 8761, 8910, 35491, 44401});
  }
}
