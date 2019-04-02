package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041597 Denominators of continued fraction convergents to sqrt(316).
 * @author Sean A. Irvine
 */
public class A041597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041597() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 25598, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 9, 76, 161, 559, 720, 25039, 25759, 102316, 230391, 1945444, 4121279, 14309281, 18430560});
  }
}
