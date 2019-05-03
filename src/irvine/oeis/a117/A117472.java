package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117472 Values of c in <code>a^2 + b^2 = c^2</code>, where b <code>- a = 17</code> and <code>gcd(a,b,c)=1</code>.
 * @author Sean A. Irvine
 */
public class A117472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117472() {
    super(new long[] {-1, 0, 6, 0}, new long[] {25, 53, 137, 305});
  }
}
