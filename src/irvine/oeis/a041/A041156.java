package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041156 Numerators of continued fraction convergents to <code>sqrt(88)</code>.
 * @author Sean A. Irvine
 */
public class A041156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041156() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 394, 0, 0, 0, 0, 0}, new long[] {9, 19, 28, 47, 75, 197, 3621, 7439, 11060, 18499, 29559, 77617});
  }
}
