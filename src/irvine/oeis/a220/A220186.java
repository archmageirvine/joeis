package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220186 Numbers n &gt;= 0 such that n^2 + n*(n+1)/2 is a square.
 * @author Sean A. Irvine
 */
public class A220186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220186() {
    super(1, new long[] {1, -99, 99}, new long[] {0, 8, 800});
  }
}
