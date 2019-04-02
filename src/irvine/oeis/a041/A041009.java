package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041009 Denominators of continued fraction convergents to sqrt(7).
 * @author Sean A. Irvine
 */
public class A041009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041009() {
    super(new long[] {-1, 0, 0, 0, 16, 0, 0, 0}, new long[] {1, 1, 2, 3, 14, 17, 31, 48});
  }
}
