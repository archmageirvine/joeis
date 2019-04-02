package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041847 Denominators of continued fraction convergents to sqrt(445).
 * @author Sean A. Irvine
 */
public class A041847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041847() {
    super(new long[] {1, 0, 0, 0, 0, 9324, 0, 0, 0, 0}, new long[] {1, 10, 11, 21, 221, 9303, 93251, 102554, 195805, 2060604});
  }
}
