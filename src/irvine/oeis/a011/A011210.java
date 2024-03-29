package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011210 Decimal expansion of 16th root of 5.
 * @author Sean A. Irvine
 */
public class A011210 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011210() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(16).inverse()));
  }
}
