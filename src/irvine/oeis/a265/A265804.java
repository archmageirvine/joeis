package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265804 Coefficient of x^2 in minimal polynomial of the continued fraction [1^n,5,1,1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A265804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265804() {
    super(new long[] {-1, 2, 2}, new long[] {1, 19, 29});
  }
}
