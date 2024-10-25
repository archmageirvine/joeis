package irvine.oeis.a072;

import irvine.oeis.a033.A033308;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072754 Numerators of continued fraction convergents to Copeland-Erdos constant.
 * @author Sean A. Irvine
 */
public class A072754 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A072754() {
    super(0, DecimalExpansionSequence.create(new A033308()));
  }
}
