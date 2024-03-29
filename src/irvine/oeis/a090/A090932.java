package irvine.oeis.a090;
// Generated by gen_seq4.pl holos at 2021-06-24 22:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090932 a(n) = n! / 2^floor(n/2).
 * Recurrence: -2*a(n)+n*(n-1)*a(n-2)=0
 * @author Georg Fischer
 */
public class A090932 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090932() {
    super(0, "[[0],[0,-1, 1],[0],[-2]]", "[1, 1]", 0);
  }
}
