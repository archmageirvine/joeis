package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220186 Numbers <code>n &gt;= 0</code> such that <code>n^2 + n*(n+1)/2</code> is a square.
 * @author Sean A. Irvine
 */
public class A220186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220186() {
    super(new long[] {1, -99, 99}, new long[] {0, 8, 800});
  }
}
