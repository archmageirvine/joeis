package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259595 Numerators of the other-side convergents to sqrt(6).
 * @author Sean A. Irvine
 */
public class A259595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259595() {
    super(new long[] {-1, 0, 10, 0}, new long[] {3, 7, 27, 71});
  }
}
