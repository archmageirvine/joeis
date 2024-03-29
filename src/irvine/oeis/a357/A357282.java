package irvine.oeis.a357;
// Generated by gen_seq4.pl holsig2/holos at 2022-10-25 23:42

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357282 a(n) = number of subsets S of {1,2,...,n} having more than 1 element such that (difference between least two elements of S) = difference between greatest two elements of S.
 * @author Georg Fischer
 */
public class A357282 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357282() {
    super(0, "[0,-2,5,-2,-4,4,-1]", "0,0,1,4,9", 0);
  }
}
