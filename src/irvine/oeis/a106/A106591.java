package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106591 Six-symbol substitution based on doubling the Rauzy substitution : n=3 characteristic polynomial: x^6-19*x^4+99*x^2-81.
 * @author Sean A. Irvine
 */
public class A106591 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106591() {
    super(0, "1", "tria", "1->456,2->444,3->555,4->222,5->333,6->123");
  }
}
