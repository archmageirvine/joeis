package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041606 Numerators of continued fraction convergents to sqrt(321).
 * @author Sean A. Irvine
 */
public class A041606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041606() {
    super(new long[] {-1, 0, 0, 0, 430, 0, 0, 0}, new long[] {17, 18, 197, 215, 7507, 7722, 84727, 92449});
  }
}
