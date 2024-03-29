package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011221 Decimal expansion of 12th root of 6.
 * @author Sean A. Irvine
 */
public class A011221 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011221() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(12).inverse()));
  }
}
