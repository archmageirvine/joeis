package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041130 Numerators of continued fraction convergents to sqrt(74).
 * @author Sean A. Irvine
 */
public class A041130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041130() {
    super(new long[] {1, 0, 0, 0, 0, 86, 0, 0, 0, 0}, new long[] {8, 9, 17, 26, 43, 714, 757, 1471, 2228, 3699});
  }
}
