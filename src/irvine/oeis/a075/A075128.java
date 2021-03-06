package irvine.oeis.a075;
// Generated by gen_seq4.pl holos [[0],[-3],[2],[2],[-3],[1]] [4,3,5,3,5] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A075128 Binomial transform of generalized tetranacci numbers A073817: a(n)=Sum((-1)^k Binomial(n,k)*A073817(k),(k=0,..,n)).
 * @author Georg Fischer
 */
public class A075128 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075128() {
    super(1, "[[0],[-3],[2],[2],[-3],[1]]", "[4,3,5,3,5]", 0);
  }
}
