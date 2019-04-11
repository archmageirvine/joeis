package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041684 Numerators of continued fraction convergents to <code>sqrt(362)</code>.
 * @author Sean A. Irvine
 */
public class A041684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041684() {
    super(new long[] {1, 38}, new long[] {19, 723});
  }
}
