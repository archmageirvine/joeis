package irvine.oeis.a076;
// Generated by gen_seq4.pl holos [[0],[1],[-2],[3],[-2],[1]] [0,1,1,-1,-3] 4 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A076118 a(n) = sum_k {n/2&lt;=k&lt;=n} k * (-1)^(n-k) * C(k,n-k).
 * @author Georg Fischer
 */
public class A076118 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A076118() {
    super(1, "[[0],[1],[-2],[3],[-2],[1]]", "[0,1,1,-1,-3]", 4);
  }
}
