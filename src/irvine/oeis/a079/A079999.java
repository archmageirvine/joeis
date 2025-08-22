package irvine.oeis.a079;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A079999 Number of permutations (p(1),p(2),...,p(n)) of (1,2,...,n) such that p(i)-i is in {-2,-1,3} for all i=1,...,n.
 * @author Georg Fischer
 */
public class A079999 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A079999() {
    super(0, "[[0],[-1],[0],[-1],[0],[1],[2],[1],[1],[0],[0],[-1]]", "1,0,0,0,1,1", 0);
  }
}
