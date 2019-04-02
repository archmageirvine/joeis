package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042814 Numerators of continued fraction convergents to sqrt(938).
 * @author Sean A. Irvine
 */
public class A042814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042814() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 34302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 61, 92, 245, 2052, 4349, 6401, 10750, 17151, 1039810, 1056961, 2096771, 3153732, 8404235, 70387612, 149179459, 219567071, 368746530, 588313601});
  }
}
