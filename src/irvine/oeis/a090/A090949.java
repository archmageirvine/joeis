package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090949 <code>a(n) = (1/24)*(n+1)*(3*n^3+59*n^2+358*n+648)</code>.
 * @author Sean A. Irvine
 */
public class A090949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090949() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 89, 203, 389});
  }
}
