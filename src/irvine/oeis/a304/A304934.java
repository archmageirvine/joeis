package irvine.oeis.a304;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: x/(1-8*x)^2*((1-8*x)/(1+8*x))^(7/8)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A304934 a(0) = 0, a(1) = 1 and a(n) = 2*a(n-1)/(n-1) + 64*a(n-2) for n &gt; 1.
 * @author Georg Fischer
 */
public class A304934 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A304934() {
    super(0, "[[0],[64,64],[2],[-1,-1]]", "[0,1,2,66]", 2);
  }
}
