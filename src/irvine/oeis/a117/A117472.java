package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117472 Values of c in a^2 + b^2 = c^2, where b - a = 17 and gcd(a,b,c)=1.
 * @author Sean A. Irvine
 */
public class A117472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117472() {
    super(new long[] {-1, 0, 6, 0}, new long[] {25, 53, 137, 305});
  }
}
