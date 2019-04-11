package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117474 The values of 'a' in <code>a^2 +</code> b^2 = c^2 where b <code>- a = 7</code> and gcd(a,b,c)=1.
 * @author Sean A. Irvine
 */
public class A117474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117474() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {5, 8, 48, 65, 297});
  }
}
