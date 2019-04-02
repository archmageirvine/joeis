package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041032 Numerators of continued fraction convergents to sqrt(21).
 * @author Sean A. Irvine
 */
public class A041032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041032() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 110, 0, 0, 0, 0, 0}, new long[] {4, 5, 9, 23, 32, 55, 472, 527, 999, 2525, 3524, 6049});
  }
}
