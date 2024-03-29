package irvine.oeis.a233;
// Generated by gen_seq4.pl holfsig/holos at 2024-02-04 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A233334 a(1) = 1; for n &gt; 1, a(n) is the smallest number &gt; a(n-1) such that a(1) + a(2) + ... + a(n) is a composite number.
 * @author Georg Fischer
 */
public class A233334 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A233334() {
    super(1, "[0, -1, 2, -1]", "1, 3, 4, 6, 7, 9, 10, 11", 0);
  }
}
