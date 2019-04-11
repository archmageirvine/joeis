package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042603 Denominators of continued fraction convergents to <code>sqrt(830)</code>.
 * @author Sean A. Irvine
 */
public class A042603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042603() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 292822, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 16, 21, 226, 247, 967, 4115, 5082, 288707, 293789, 1463863, 4685378, 6149241, 66177788, 72327029, 283158875, 1204962529, 1488121404});
  }
}
