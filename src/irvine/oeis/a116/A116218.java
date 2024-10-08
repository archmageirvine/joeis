package irvine.oeis.a116;
// manually 2024-08-10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116218 If X_1,...,X_n is a partition of a 2n-set X into 2-blocks (or pairs) then a(n) is equal to the number of permutations f of X such that f(X_i) != X_i for all i=1,...n.
 * such that f(X_i) != X_i for all i=1,...n.
 * @author Georg Fischer
 */
public class A116218 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116218() {
    super(0, "[[0],[-32,48,-16],[-12,28,-16],[2,2,-4],[1]]", "[1,0,20]", 0);
  }
}
