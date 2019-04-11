package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041175 Denominators of continued fraction convergents to <code>sqrt(97)</code>.
 * @author Sean A. Irvine
 */
public class A041175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041175() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11208, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 7, 13, 20, 33, 53, 86, 483, 569, 10725, 11294, 67195, 78489, 145684, 224173, 369857, 594030, 963887, 5413465, 6377352});
  }
}
