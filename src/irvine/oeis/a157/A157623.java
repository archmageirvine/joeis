package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157623 a(n) = 781250*n^2 - 455000*n + 66249.
 * @author Sean A. Irvine
 */
public class A157623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157623() {
    super(1, new long[] {1, -3, 3}, new long[] {392499, 2281249, 5732499});
  }
}
