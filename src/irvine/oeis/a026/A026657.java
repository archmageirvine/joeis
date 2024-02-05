package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026657 a(n) = Sum_{i=0..n, j=0..n} A026648(i,j).
 * @author Sean A. Irvine
 */
public class A026657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026657() {
    super(new long[] {-2, 2, -4, 4, 1}, new long[] {1, 3, 8, 18, 40});
  }
}
