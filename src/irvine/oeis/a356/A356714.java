package irvine.oeis.a356;
// manually holsig2/holos at 2022-10-25 21:49

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356714 Cardinality of the set{a_1+a_2+a_3+a_4: -floor((n-1)/2) &lt;= a_1,a_2,a_3,a_4 &lt;= floor(n/2), and a_1^2,a_2^2,a_3^2,a_4^2 are pairwise distinct}.
 * @author Georg Fischer
 */
public class A356714 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356714() {
    super(1, "[0,-1,2,-1]", "0,0,0,0,0,4,7,15,21,25", 0);
  }
}
