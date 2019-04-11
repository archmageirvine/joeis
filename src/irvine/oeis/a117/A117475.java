package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117475 The values of c in <code>a^2 + b^2 =</code> c^2 where <code>b - a = 23</code> and gcd(a,b,c) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A117475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117475() {
    super(new long[] {-1, 0, 6, 0}, new long[] {37, 65, 205, 373});
  }
}
