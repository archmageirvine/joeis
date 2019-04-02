package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041337 Denominators of continued fraction convergents to sqrt(182).
 * @author Sean A. Irvine
 */
public class A041337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041337() {
    super(new long[] {-1, 0, 54, 0}, new long[] {1, 2, 53, 108});
  }
}
