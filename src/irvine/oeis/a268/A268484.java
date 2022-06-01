package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268484 a(n) = (n + 1)*(4*n^2 + 14*n + 9)/3.
 * @author Sean A. Irvine
 */
public class A268484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268484() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 53, 116});
  }
}
