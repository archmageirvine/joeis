package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113829 <code>a(n) = a(n-1) + 2^(k(n)),</code> where <code>k(n)</code> is the n-th term of the sequence of numbers that are congruent to <code>{0,3,4,5,7,8} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A113829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113829() {
    super(new long[] {-4096, 4096, 0, 0, 0, 0, 1}, new long[] {1, 9, 25, 57, 185, 441, 4537});
  }
}
