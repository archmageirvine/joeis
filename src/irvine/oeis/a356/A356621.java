package irvine.oeis.a356;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356621 a(n) = number of k-tuples (u(1), u(2), ..., u(k)) with 1 &lt;= u(1) &lt; u(2) &lt; ... &lt; u(k) &lt;= n such that u(i) - u(i-1) &lt;= 5 for i = 2,...,k.
 * @author Georg Fischer
 */
public class A356621 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356621() {
    super(0, "[0,1,-1,0,0,0,-2,3,-1]", "0,1,4,11,26,57", 0);
  }
}
