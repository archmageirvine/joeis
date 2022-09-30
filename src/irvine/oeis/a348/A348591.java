package irvine.oeis.a348;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348591 a(n) = L(n)*L(n+1) mod F(n+2) where F=A000045 is the Fibonacci numbers and L = A000032 is the Lucas numbers.
 * @author Georg Fischer
 */
public class A348591 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348591() {
    super(0, "[0,-1,-1,3,3,-1,-1]", "0,1,0,3,5,3,18", 0);
  }
}
