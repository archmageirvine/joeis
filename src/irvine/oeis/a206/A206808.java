package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206808 Sum_{0&lt;j&lt;n} n^3-j^3.
 * @author Sean A. Irvine
 */
public class A206808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206808() {
    super(2, new long[] {1, -5, 10, -10, 5}, new long[] {7, 45, 156, 400, 855});
  }
}
