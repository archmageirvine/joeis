package irvine.oeis.a182;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182400 Integral factorial ratio sequence: a(n) = (2*n)!*(8*n)!/(n!*(4*n)!*(5*n)!).
 * @author Georg Fischer
 */
public class A182400 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182400() {
    super(0, "[[0],[3360,-51776, 266240,-614400, 655360,-262144],[0, 120,-1250, 4375,-6250, 3125]]", "[1, 28]", 0);
  }
}
