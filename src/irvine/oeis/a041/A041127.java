package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041127 Denominators of continued fraction convergents to sqrt(72).
 * @author Sean A. Irvine
 */
public class A041127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041127() {
    super(new long[] {-1, 0, 34, 0}, new long[] {1, 2, 33, 68});
  }
}
