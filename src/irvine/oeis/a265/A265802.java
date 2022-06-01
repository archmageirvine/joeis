package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265802 Coefficient of x^2 in minimal polynomial of the continued fraction [1^n,4,1,1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A265802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265802() {
    super(new long[] {-1, 2, 2}, new long[] {1, 11, 19});
  }
}
