package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117472 Values of c in <code>a^2 + b^2 =</code> c^2, where <code>b - a = 17</code> and gcd(a,b,c)=1.
 * @author Sean A. Irvine
 */
public class A117472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117472() {
    super(new long[] {-1, 0, 6, 0}, new long[] {25, 53, 137, 305});
  }
}
