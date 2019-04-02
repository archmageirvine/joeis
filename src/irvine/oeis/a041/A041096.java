package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041096 Numerators of continued fraction convergents to sqrt(56).
 * @author Sean A. Irvine
 */
public class A041096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041096() {
    super(new long[] {-1, 0, 30, 0}, new long[] {7, 15, 217, 449});
  }
}
