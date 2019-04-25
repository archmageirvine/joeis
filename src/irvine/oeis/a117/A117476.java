package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117476 The values of <code>a in a^2 + b^2 =</code> c^2 where <code>b - a = 23</code> and gcd(a,b,c)=1.
 * @author Sean A. Irvine
 */
public class A117476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117476() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {12, 33, 133, 252, 832});
  }
}
