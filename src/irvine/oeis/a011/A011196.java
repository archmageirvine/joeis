package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011196 Decimal expansion of 17th root of 4.
 * @author Sean A. Irvine
 */
public class A011196 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011196() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(17).inverse()));
  }
}
