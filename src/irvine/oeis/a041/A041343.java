package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041343 Denominators of continued fraction convergents to sqrt(185).
 * @author Sean A. Irvine
 */
public class A041343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041343() {
    super(new long[] {1, 0, 0, 0, 0, 136, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 133, 138, 271, 409, 680});
  }
}
