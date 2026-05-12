package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106599 Two block six-symbol substitution : n=1.
 * @author Sean A. Irvine
 */
public class A106599 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106599() {
    super(0, "1", "tria", "1->56,2->4,3->5,4->2,5->3,6->12");
  }
}
