package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023545 Convolution of natural numbers &gt;= 2 and natural numbers &gt;= 3.
 * @author Sean A. Irvine
 */
public class A023545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023545() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {6, 17, 34, 58});
  }
}
