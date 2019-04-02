package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042410 Numerators of continued fraction convergents to sqrt(733).
 * @author Sean A. Irvine
 */
public class A042410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042410() {
    super(new long[] {1, 0, 0, 0, 0, 19764, 0, 0, 0, 0}, new long[] {27, 352, 379, 731, 9882, 534359, 6956549, 7490908, 14447457, 195307849});
  }
}
