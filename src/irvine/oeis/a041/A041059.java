package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041059 Denominators of continued fraction convergents to sqrt(35).
 * @author Sean A. Irvine
 */
public class A041059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041059() {
    super(new long[] {-1, 0, 12, 0}, new long[] {1, 1, 11, 12});
  }
}
