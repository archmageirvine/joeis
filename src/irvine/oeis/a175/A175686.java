package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175686 a(n) = binomial(n-j-1,j) + binomial(n-j,j-1) with j= floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A175686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175686() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {0, 1, 1, 2, 3, 4, 7, 7});
  }
}
