package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251769 Numbers n such that the sum of the heptagonal numbers H(n), H(n+1) and H(n+2) is equal to the sum of three consecutive squares.
 * @author Sean A. Irvine
 */
public class A251769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251769() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {17, 239, 25529, 345647, 36813809});
  }
}
