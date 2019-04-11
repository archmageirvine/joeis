package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024862 <code>a(n) =</code> s(1)t(n) + s(2)t(n-1) <code>+ ... +</code> s(k)t(n-k+1), where <code>k = floor( n/2 ),</code> s = natural numbers, t = odd natural numbers.
 * @author Sean A. Irvine
 */
public class A024862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024862() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 5, 17, 23, 50, 62, 110});
  }
}
