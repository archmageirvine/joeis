package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041757 Denominators of continued fraction convergents to sqrt(398).
 * @author Sean A. Irvine
 */
public class A041757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041757() {
    super(new long[] {-1, 0, 0, 0, 798, 0, 0, 0}, new long[] {1, 1, 19, 20, 779, 799, 15161, 15960});
  }
}
