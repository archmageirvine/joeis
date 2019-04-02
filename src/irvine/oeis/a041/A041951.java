package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041951 Denominators of continued fraction convergents to sqrt(498).
 * @author Sean A. Irvine
 */
public class A041951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041951() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 359554, 0, 0, 0, 0, 0}, new long[] {1, 3, 19, 421, 2545, 8056, 357009, 1079083, 6831507, 151372237, 915064929, 2896567024L});
  }
}
