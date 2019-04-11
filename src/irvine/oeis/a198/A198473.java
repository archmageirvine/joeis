package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198473 If n even, then <code>2n.</code> If n odd, then nearest integer to <code>2n/3</code>.
 * @author Sean A. Irvine
 */
public class A198473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198473() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {0, 1, 4, 2, 8, 3, 12, 5});
  }
}
