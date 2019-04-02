package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041832 Numerators of continued fraction convergents to sqrt(437).
 * @author Sean A. Irvine
 */
public class A041832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041832() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 9198, 0, 0, 0, 0, 0}, new long[] {20, 21, 209, 439, 4160, 4599, 188120, 192719, 1922591, 4037901, 38263700, 42301601});
  }
}
