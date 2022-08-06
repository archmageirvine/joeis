package irvine.oeis.a152;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A152886 Number of descents beginning and ending with an even number in all permutations of {1,2,...,n}.
 * Recurrence +(-n+4)*a(n) +(n-1)*a(n-1) +(n-2)*(n-1)^2*a(n-2)=0.
 * @author Georg Fischer
 */
public class A152886 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A152886() {
    super(1, "[[0],[-2, 5,-4, 1],[-1, 1],[4,-1]", "0, 0, 0, 6", 0);
  }
}
