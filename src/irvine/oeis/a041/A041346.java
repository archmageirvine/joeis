package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041346 Numerators of continued fraction convergents to <code>sqrt(187)</code>.
 * @author Sean A. Irvine
 */
public class A041346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041346() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3364, 0, 0, 0, 0, 0}, new long[] {13, 14, 41, 547, 1135, 1682, 44867, 46549, 137965, 1840094, 3818153, 5658247});
  }
}
