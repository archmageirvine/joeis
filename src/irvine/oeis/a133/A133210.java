package irvine.oeis.a133;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A133210 Limiting word of the morphism 1-&gt;{1, 6, 10, 12}, 2-&gt; {2, 5, 9, 11}, 3-&gt; {1, 3, 8, 12}, 4-&gt; {2, 4, 7, 11}, 5-&gt; {1, 5, 6, 12}, 6-&gt; {2, 6, 5, 11}, 7-&gt; {1, 7, 4, 12}, 8-&gt; {2, 8, 3, 11}, 9-&gt; {1, 9, 2, 12}, 10-&gt; {2, 10, 5, 11}, 11-&gt; {1, 11, 6, 12}, 12-&gt; {2, 12, 7, 11}.
 * @author Sean A. Irvine
 */
public class A133210 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A133210() {
    super(1, "1", "1", "1->16AC, 2->259B, 3->138C, 4->247B, 5->156C, 6->265B, 7->174C, 8->283B, 9->192C, A->2A5B, B->1B6C, C->2C7B");
  }
}

