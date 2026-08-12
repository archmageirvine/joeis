package irvine.oeis.a133;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A133441 2-Limiting word of the morphism 1-&gt;2368, 2-&gt;1457, 3-&gt;1468, 4-&gt;2357, 5-&gt;2467, 6-&gt;1358, 7-&gt;2458, 8-&gt;1367.
 * @author Sean A. Irvine
 */
public class A133441 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A133441() {
    super(1, "1", "2", "1->2368,2->1457,3->1468,4->2357,5->2467,6->1358,7->2458,8->1367");
  }
}
