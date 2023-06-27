package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026037 a(n) = dot_product(1,2,...,n)*(3,4,...,n,1,2).
 * @author Sean A. Irvine
 */
public class A026037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026037() {
    super(3, new long[] {-1, 4, -6, 4}, new long[] {11, 22, 40, 67});
  }
}
