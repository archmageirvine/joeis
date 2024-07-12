package irvine.oeis.a136;

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A136127 Number of permutations of {1,2,...,n} having excedance set {1,2,...,k} for some k=0...n-1 (for k=0 we have the empty set). The excedance set of a permutation p in S_n is the set of indices i such that p(i)&gt;i.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A136127 extends PrependSequence {

  /** Construct the sequence. */
  public A136127() {
    super(new RowSumSequence(0, new A136126()), 1);
  }
}
