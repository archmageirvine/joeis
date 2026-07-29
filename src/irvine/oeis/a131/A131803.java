package irvine.oeis.a131;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A131803 Limiting word of the morphism 1-&gt;{1, 4, 8, 11}, 2-&gt;{2, 6, 9, 1}, 3-&gt;{3, 6, 10, 1}, 4-&gt;{4, 8, 11, 3}, 5-&gt;{5, 8, 12, 3}, 6-&gt;{6, 10, 1, 5}, 7-&gt;{7, 10, 2, 5}, 8-&gt;{8, 12, 3, 7}, 9-&gt;{9, 12, 4, 7}, 10-&gt;{10, 2, 5, 9}, 11-&gt;{11, 4, 6, 9}, 12-&gt;{12, 4, 7, 11} starting from 4, 11, 9, 2, 5, 7.
 * @author Sean A. Irvine
 */
public class A131803 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A131803() {
    super(1, "4B9257", "4", "1->148B, 2->2691, 3->36A1, 4->48B3, 5->58C3, 6->6A15, 7->7A25, 8->8C37, 9->9C47, A->A259, B->B469, C->C47B");
  }
}
