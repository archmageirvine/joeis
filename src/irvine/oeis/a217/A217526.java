package irvine.oeis.a217;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A217526 From the enumeration of involutions avoiding the pattern 4321.
 * radtorec(1/2-1/2*x-1/2*(-3*x^2-2*x+1)^(1/2)-x^2/(1-x)/(-x^2+1))
 * @author Georg Fischer
 */
public class A217526 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217526() {
    super(0, "[[0],[90,-33, 3],[-210, 107,-13],[-98, 80,-14],[274,-148, 18],[72,-63, 11],[0, 25,-5]]", "0, 0, 0, 0, 0, 2, 6, 18, 47, 123, 318", 0);
  }
}
