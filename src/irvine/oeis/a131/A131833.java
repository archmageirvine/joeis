package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131833 a(n) = 2^(n+1) - 1 + 3*n.
 * @author Sean A. Irvine
 */
public class A131833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131833() {
    super(new long[] {2, -5, 4}, new long[] {1, 6, 13});
  }
}
