package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011186 Decimal expansion of 7th root of 4.
 * @author Sean A. Irvine
 */
public class A011186 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011186() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.SEVEN.inverse()));
  }
}
