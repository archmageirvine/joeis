package irvine.oeis.a328;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A328348 Let S be any integer in the range 3 &lt;= S &lt;= 17. Sequence has the property that a(n)*S is the sum of all positive integers whose decimal expansion has &lt;= n digits and contains at most two distinct nonzero digits p and q such that p+q=S.
 * @author Georg Fischer
 */
public class A328348 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328348() {
    super(0, "[0,-40, 62,-23, 1]", "[0, 1, 23]", 0);
  }
}
