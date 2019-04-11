package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041020 Numerators of continued fraction convergents to <code>sqrt(14)</code>.
 * @author Sean A. Irvine
 */
public class A041020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041020() {
    super(new long[] {-1, 0, 0, 0, 30, 0, 0, 0}, new long[] {3, 4, 11, 15, 101, 116, 333, 449});
  }
}
