package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025781 Expansion of 1/((1-x)(1-x^5)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A025781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025781() {
    super(new long[] {1, -1, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6});
  }
}
