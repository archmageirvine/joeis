package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041808 Numerators of continued fraction convergents to sqrt(425).
 * @author Sean A. Irvine
 */
public class A041808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041808() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 536, 0, 0, 0, 0, 0, 0}, new long[] {20, 21, 41, 62, 103, 165, 268, 10885, 11153, 22038, 33191, 55229, 88420, 143649});
  }
}
