package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042166 Numerators of continued fraction convergents to <code>sqrt(608)</code>.
 * @author Sean A. Irvine
 */
public class A042166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042166() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 5474, 0, 0, 0, 0, 0, 0, 0}, new long[] {24, 25, 49, 74, 863, 937, 1800, 2737, 133176, 135913, 269089, 405002, 4724111, 5129113, 9853224, 14982337});
  }
}
