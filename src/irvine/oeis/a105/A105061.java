package irvine.oeis.a105;
// Generated by gen_seq4.pl morfix at 2023-09-20 08:25

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A105061 Triangle read by rows, based on the morphism f: 1-&gt;2, 2-&gt;3, 3-&gt;4, 4-&gt;5, 5-&gt;{5,5,9,6}, 6-&gt;7, 7-&gt;8, 8-&gt;9, 9-&gt;10, 10-&gt;{10,10,4,1}. First row is 1. If current row is a,b,c,..., then the next row is a,b,c,...,f(a),f(b),f(c),...
 * @author Georg Fischer
 */
public class A105061 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A105061() {
    super(1, "1", "rows", "1->2,2->3,3->4,4->5,5->5596,6->7,7->8,8->9,9->A,A->AA41");
  }
}
