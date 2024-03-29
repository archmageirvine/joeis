package irvine.oeis.a103;
// Generated by gen_seq4.pl holos [[0],[-2,1],[7,-14],[1,1]] [1,4,28] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A103211 a(n) = (1/n) * Sum_{i=0..n-1} C(n,i)*C(n,i+1)*3^i*4^(n-i), a(0)=1.
 * @author Georg Fischer
 */
public class A103211 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103211() {
    super(0, "[[0],[-2,1],[7,-14],[1,1]]", "[1,4,28]", 0);
  }
}
