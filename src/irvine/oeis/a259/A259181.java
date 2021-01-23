package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259181 a(n) = n*(n+1)*(n+2)*(n+3)*(2*n^2+6*n+7)/360.
 * @author Sean A. Irvine
 */
public class A259181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259181() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 9, 43, 147, 406, 966});
  }
}
