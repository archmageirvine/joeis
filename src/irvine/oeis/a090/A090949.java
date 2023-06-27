package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090949 a(n) = (1/24)*(n+1)*(3*n^3+59*n^2+358*n+648).
 * @author Sean A. Irvine
 */
public class A090949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090949() {
    super(-1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 89, 203, 389});
  }
}
