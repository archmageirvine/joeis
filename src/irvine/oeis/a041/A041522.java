package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041522 Numerators of continued fraction convergents to <code>sqrt(278)</code>.
 * @author Sean A. Irvine
 */
public class A041522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041522() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 5002, 0, 0, 0, 0, 0}, new long[] {16, 17, 50, 817, 1684, 2501, 81716, 84217, 250150, 4086617, 8423384, 12510001});
  }
}
