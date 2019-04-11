package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028895 5 times triangular numbers: <code>a(n) = 5*n*(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A028895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028895() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 15});
  }
}
