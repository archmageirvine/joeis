package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041345 Denominators of continued fraction convergents to sqrt(186).
 * @author Sean A. Irvine
 */
public class A041345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041345() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 11, 47, 152, 199, 351, 550, 14651, 15201, 29852, 45053, 165011, 705097, 2280302, 2985399, 5265701, 8251100});
  }
}
