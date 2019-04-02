package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042645 Denominators of continued fraction convergents to sqrt(852).
 * @author Sean A. Irvine
 */
public class A042645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042645() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 388798, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 16, 37, 164, 365, 1259, 6660, 387539, 1944355, 6220604, 14385563, 63762856, 141911275, 489496681, 2589394680L});
  }
}
