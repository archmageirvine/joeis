package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117475 The values of c in a^2 + b^2 = c^2 where b - a = 23 and gcd(a,b,c) = 1.
 * @author Sean A. Irvine
 */
public class A117475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117475() {
    super(new long[] {-1, 0, 6, 0}, new long[] {37, 65, 205, 373});
  }
}
