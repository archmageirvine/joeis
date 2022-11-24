package irvine.oeis.a095;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A095698 Number of permutations of {1,2,3,...,n} where, for 1 &lt; i &lt;= n, the i-th number has maximized sum of the i-1 absolute differences from all previous numbers of the permutation.
 * the i-th number has maximized sum of the i-1 absolute differences from all previous numbers of the permutation.
 * @author Georg Fischer
 */
public class A095698 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A095698() {
    super(1, "[0,-6, 0, 5, 0,-1]", "1, 2, 4, 6", 0);
  }
}
