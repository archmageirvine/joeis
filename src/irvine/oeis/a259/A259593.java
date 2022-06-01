package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259593 Numerators of the other-side convergents to sqrt(3).
 * @author Sean A. Irvine
 */
public class A259593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259593() {
    super(new long[] {-1, 0, 4, 0}, new long[] {2, 3, 7, 12});
  }
}
