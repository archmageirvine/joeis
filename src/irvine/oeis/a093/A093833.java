package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093833 3^n-Jacobsthal(n).
 * @author Sean A. Irvine
 */
public class A093833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093833() {
    super(new long[] {-6, -1, 4}, new long[] {1, 2, 8});
  }
}
