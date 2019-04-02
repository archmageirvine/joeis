package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041363 Denominators of continued fraction convergents to sqrt(195).
 * @author Sean A. Irvine
 */
public class A041363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041363() {
    super(new long[] {-1, 0, 28, 0}, new long[] {1, 1, 27, 28});
  }
}
