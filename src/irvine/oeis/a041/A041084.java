package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041084 Numerators of continued fraction convergents to sqrt(50).
 * @author Sean A. Irvine
 */
public class A041084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041084() {
    super(new long[] {1, 14}, new long[] {7, 99});
  }
}
