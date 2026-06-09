package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106593 Six-symbol substitution based on doubling the Rauzy substitution : n=1 characteristic polynomial: x^6-3*x^4+3*x^2-1.
 * @author Sean A. Irvine
 */
public class A106593 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106593() {
    super(0, "1", "tria", "1->456, 2->4, 3->5, 4->2, 5->3, 6->123");
  }
}
