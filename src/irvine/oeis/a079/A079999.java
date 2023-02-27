package irvine.oeis.a079;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A079999 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=3, I={0,1,2}.
 * @author Georg Fischer
 */
public class A079999 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A079999() {
    super(0, "[[0],[-1],[0],[-1],[0],[1],[2],[1],[1],[0],[0],[-1]]", "1,0,0,0,1,1", 0);
  }
}
