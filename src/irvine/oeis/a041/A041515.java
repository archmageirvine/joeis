package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041515 Denominators of continued fraction convergents to sqrt(274).
 * @author Sean A. Irvine
 */
public class A041515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041515() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 2814, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 38, 47, 85, 2767, 2852, 5619, 25328, 106931, 132259, 239190});
  }
}
