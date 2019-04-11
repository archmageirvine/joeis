package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259594 Denominators of the other-side convergents to <code>sqrt(6)</code>.
 * @author Sean A. Irvine
 */
public class A259594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259594() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 3, 11, 29});
  }
}
