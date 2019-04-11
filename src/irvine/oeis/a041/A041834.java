package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041834 Numerators of continued fraction convergents to <code>sqrt(438)</code>.
 * @author Sean A. Irvine
 */
public class A041834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041834() {
    super(new long[] {-1, 0, 0, 0, 586, 0, 0, 0}, new long[] {20, 21, 272, 293, 11992, 12285, 159412, 171697});
  }
}
