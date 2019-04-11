package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024219 <code>a(n) = floor(</code> (2nd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) <code>),</code> where S(n) = {first <code>n+1</code> positive integers congruent to <code>1 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024219() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 3, 7, 12, 19});
  }
}
