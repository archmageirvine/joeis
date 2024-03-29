package irvine.oeis.a119;
// Generated by gen_seq4.pl holos [[0],[-8,36,-66,63,-33,9,-1],[3,-12,18,-12,3],[-2,3,-3],[1]] [1,2,13,172] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A119400 a(n) = Sum_{k=0..n} (n!/k!)^2*binomial(n,k).
 * @author Georg Fischer
 */
public class A119400 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A119400() {
    super(0, "[[0],[-8,36,-66,63,-33,9,-1],[3,-12,18,-12,3],[-2,3,-3],[1]]", "[1,2,13,172]", 0);
  }
}
