package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164854 Diagonal sum of generalized Pascal triangle; (10^n,1).
 * @author Sean A. Irvine
 */
public class A164854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164854() {
    super(new long[] {-10, -10, 11, 1}, new long[] {1, 1, 11, 12});
  }
}
