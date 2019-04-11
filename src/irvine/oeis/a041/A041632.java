package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041632 Numerators of continued fraction convergents to <code>sqrt(335)</code>.
 * @author Sean A. Irvine
 */
public class A041632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041632() {
    super(new long[] {-1, 0, 0, 0, 1208, 0, 0, 0}, new long[] {18, 55, 183, 604, 21927, 66385, 221082, 729631});
  }
}
