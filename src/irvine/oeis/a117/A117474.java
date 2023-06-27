package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117474 The values of 'a' in a^2 + b^2 = c^2 where b - a = 7 and gcd(a,b,c)=1.
 * @author Sean A. Irvine
 */
public class A117474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117474() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {5, 8, 48, 65, 297});
  }
}
