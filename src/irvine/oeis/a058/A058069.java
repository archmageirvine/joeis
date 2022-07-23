package irvine.oeis.a058;

import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A058069 Numerators of convergents to Champernowne constant (A033307).
 * @author Sean A. Irvine
 */
public class A058069 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A058069() {
    super(new DecimalExpansionSequence(A058068.CHAMPERKNOWNE_CONSTANT));
  }
}
