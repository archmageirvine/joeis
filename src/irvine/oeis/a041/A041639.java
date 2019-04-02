package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041639 Denominators of continued fraction convergents to sqrt(338).
 * @author Sean A. Irvine
 */
public class A041639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041639() {
    super(new long[] {1, 0, 0, 0, 0, 478, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 13, 473, 959, 1432, 2391, 6214});
  }
}
