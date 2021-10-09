package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011234 Decimal expansion of 10th root of 7.
 * @author Sean A. Irvine
 */
public class A011234 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011234() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.TEN.inverse()));
  }
}
