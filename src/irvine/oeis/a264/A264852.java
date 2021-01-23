package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264852 a(n) = n*(n + 1)*(n + 2)*(9*n - 7)/12.
 * @author Sean A. Irvine
 */
public class A264852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264852() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 22, 100, 290});
  }
}
