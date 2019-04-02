package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042401 Denominators of continued fraction convergents to sqrt(727).
 * @author Sean A. Irvine
 */
public class A042401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042401() {
    super(new long[] {-1, 0, 0, 0, 1456, 0, 0, 0}, new long[] {1, 1, 26, 27, 1430, 1457, 37855, 39312});
  }
}
