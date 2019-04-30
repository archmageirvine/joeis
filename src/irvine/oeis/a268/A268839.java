package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268839 <code>a(n) = Sum_{j=1..10^n-1} 2^f(j)</code> where <code>f(j)</code> is the number of zero digits in the decimal representation of j.
 * @author Sean A. Irvine
 */
public class A268839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268839() {
    super(new long[] {-11, 12}, new long[] {9, 108});
  }
}
