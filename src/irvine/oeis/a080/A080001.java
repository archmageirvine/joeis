package irvine.oeis.a080;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A080001 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=3, I={-1,0,2}.
 * @author Georg Fischer
 */
public class A080001 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A080001() {
    super(0, "[[0],[-1],[-1],[0],[0],[0],[2],[1],[1],[0],[0],[-1]]", "1,0,0,1,1,1", 0);
  }
}
