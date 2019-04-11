package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267797 Lucas numbers of the form <code>(x^3 +</code> y^3) <code>/ 2</code> where x and y are distinct positive integers.
 * @author Sean A. Irvine
 */
public class A267797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267797() {
    super(new long[] {-1, 18}, new long[] {76, 1364});
  }
}
