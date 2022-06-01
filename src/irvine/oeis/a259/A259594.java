package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259594 Denominators of the other-side convergents to sqrt(6).
 * @author Sean A. Irvine
 */
public class A259594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259594() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 3, 11, 29});
  }
}
