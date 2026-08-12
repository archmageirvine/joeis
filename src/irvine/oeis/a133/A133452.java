package irvine.oeis.a133;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A133452 3-Limiting word of the morphism 1-&gt;{3, 5, 7, 10}; 2-&gt;{4, 6, 8, 11}; 3-&gt;{1, 5, 7, 10}; 4-&gt;{2, 6, 8, 9}; 5-&gt;{1, 3, 10, 12}; 6-&gt;{2, 4, 9, 11}; 7-&gt;{1, 3, 10, 12}; 8-&gt;{2, 4, 9, 11}; 9-&gt;{4, 6, 8, 11}; 10-&gt;{1, 5, 7, 12}; 11-&gt;{2, 6, 8, 9}; 12-&gt;{3, 5, 7, 10}.
 * @author Sean A. Irvine
 */
public class A133452 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A133452() {
    super(1, "1", "3", "1->357A,2->468B,3->157A,4->2689,5->13AC,6->249B,7->13AC,8->249B,9->468B,A->157C,B->2689,C->357A");
  }
}

// 1->{3, 5, 7, 10}; 2->{4, 6, 8, 11}; 3->{1, 5, 7, 10}; 4->{2, 6, 8, 9}; 5->{1, 3, 10, 12}; 6->{2, 4, 9, 11}; 7->{1, 3, 10, 12}; 8->{2, 4, 9, 11}; 9->{4, 6, 8, 11}; 10->{1, 5, 7, 12}; 11->{2, 6, 8, 9}; 12->{3, 5, 7, 10}
