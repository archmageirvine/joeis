package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041833 Denominators of continued fraction convergents to sqrt(437).
 * @author Sean A. Irvine
 */
public class A041833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041833() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9198, 0, 0, 0, 0, 0}, new long[] {1, 1, 10, 21, 199, 220, 8999, 9219, 91970, 193159, 1830401, 2023560});
  }
}
