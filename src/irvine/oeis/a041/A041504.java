package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041504 Numerators of continued fraction convergents to sqrt(269).
 * @author Sean A. Irvine
 */
public class A041504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041504() {
    super(new long[] {1, 0, 0, 164, 0, 0}, new long[] {16, 33, 82, 2657, 5396, 13449});
  }
}
