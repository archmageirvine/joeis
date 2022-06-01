package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257200 a(n) = n*(n+1)*(n+2)*(n+3)*(n^2+3*n+26)/720.
 * @author Sean A. Irvine
 */
public class A257200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257200() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 6, 22, 63, 154, 336, 672});
  }
}
