package irvine.oeis.a181;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A181202 a(n)=0!*1!*2!*3!*(4*n)!*6*n*(n-1) / ((n)!*(n+1)!*(n+2)!*(n+3)!).
 * @author Georg Fischer
 */
public class A181202 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A181202() {
    super(1, "[[0],[0, 24,-176, 384,-256],[-12,-16,-1, 4, 1]]", "[0, 168, 16632]", 0);
  }
}
