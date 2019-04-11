package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041054 Numerators of continued fraction convergents to <code>sqrt(33)</code>.
 * @author Sean A. Irvine
 */
public class A041054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041054() {
    super(new long[] {-1, 0, 0, 0, 46, 0, 0, 0}, new long[] {5, 6, 17, 23, 247, 270, 787, 1057});
  }
}
