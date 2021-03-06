package irvine.oeis.a298;
// Generated by gen_seq4.pl holos [[0],[1],[2],[3],[4],[1],[0],[-1],[-2],[1]] [0,0,1,3,7,17,40,90,198] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A298371 a(n) = Sum_{m=0..n} Sum_{i=0..m} i*C(m-i,i)*C(m-i,n-m-i).
 * @author Georg Fischer
 */
public class A298371 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A298371() {
    super(1, "[[0],[1],[2],[3],[4],[1],[0],[-1],[-2],[1]]", "[0,0,1,3,7,17,40,90,198]", 0);
  }
}
