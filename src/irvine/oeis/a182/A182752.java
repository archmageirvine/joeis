package irvine.oeis.a182;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182752 a(1) = 1, a(2) = 6, for n &gt;= 3; a(n) = the smallest number greater than a(n-1) such that [[a(n-2) + a(n-1)] * [a(n-2) + a(n)] * [a(n-1) + a(n)]] / [a(n-2) * a(n-1) * a(n)] is an integer.
 * @author Georg Fischer
 */
public class A182752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182752() {
    super(0, "[[0],[14],[0],[-1]]", "1, 6", 0);
  }
}
