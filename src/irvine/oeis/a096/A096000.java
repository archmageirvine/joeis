package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096000 Cupolar numbers: a(n) = (n+1)*(5*n^2+7*n+3)/3.
 * @author Sean A. Irvine
 */
public class A096000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096000() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 37, 92});
  }
}
