package irvine.oeis.a303;
// Generated by gen_seq4.pl holos [[0],[-8,0,32],[6,4,-16],[0,-1,2]] [0,3,25] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A303602 a(n) = Sum_{k = 0..n} k*binomial(2*n+1, k).
 * @author Georg Fischer
 */
public class A303602 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A303602() {
    super(0, "[[0],[-8,0,32],[6,4,-16],[0,-1,2]]", "[0,3,25]", 0);
  }
}
