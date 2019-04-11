package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041556 Numerators of continued fraction convergents to <code>sqrt(296)</code>.
 * @author Sean A. Irvine
 */
public class A041556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041556() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 7398, 0, 0, 0, 0, 0}, new long[] {17, 69, 86, 671, 757, 3699, 126523, 509791, 636314, 4963989, 5600303, 27365201});
  }
}
