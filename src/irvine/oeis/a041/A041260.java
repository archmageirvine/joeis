package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041260 Numerators of continued fraction convergents to sqrt(142).
 * @author Sean A. Irvine
 */
public class A041260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041260() {
    super(new long[] {-1, 0, 0, 0, 286, 0, 0, 0}, new long[] {11, 12, 131, 143, 3277, 3420, 37477, 40897});
  }
}
