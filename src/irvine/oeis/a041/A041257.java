package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041257 Denominators of continued fraction convergents to sqrt(140).
 * @author Sean A. Irvine
 */
public class A041257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041257() {
    super(new long[] {-1, 0, 0, 0, 142, 0, 0, 0}, new long[] {1, 1, 5, 6, 137, 143, 709, 852});
  }
}
