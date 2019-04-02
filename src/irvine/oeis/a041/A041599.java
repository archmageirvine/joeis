package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041599 Denominators of continued fraction convergents to sqrt(317).
 * @author Sean A. Irvine
 */
public class A041599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041599() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 705236, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 41, 46, 133, 312, 445, 3872, 15933, 19805, 689303, 709108, 3525735, 28914988, 32440723, 93796434, 220033591, 313830025, 2730673791L, 11236525189L, 13967198980L});
  }
}
