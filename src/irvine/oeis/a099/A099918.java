package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099918 A Chebyshev transform related to the 7th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A099918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099918() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {1, -1, 2, -2, 1, -1});
  }
}
