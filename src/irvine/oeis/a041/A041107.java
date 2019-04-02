package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041107 Denominators of continued fraction convergents to sqrt(61).
 * @author Sean A. Irvine
 */
public class A041107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041107() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 59436, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 16, 21, 58, 137, 195, 722, 3083, 3805, 56353, 60158, 296985, 951113, 1248098, 3447309, 8142716, 11590025, 42912791, 183241189, 226153980});
  }
}
