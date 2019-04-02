package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041709 Denominators of continued fraction convergents to sqrt(374).
 * @author Sean A. Irvine
 */
public class A041709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041709() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6730, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 56, 59, 174, 6671, 13516, 20187, 376882, 397069, 1171020});
  }
}
