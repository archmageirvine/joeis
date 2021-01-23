package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259597 Numerators of the other-side convergents to sqrt(7).
 * @author Sean A. Irvine
 */
public class A259597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259597() {
    super(new long[] {-1, 0, 0, 0, 16, 0, 0, 0}, new long[] {3, 5, 8, 13, 45, 82, 127, 209});
  }
}
