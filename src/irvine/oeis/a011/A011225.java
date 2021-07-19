package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011225 Decimal expansion of 16th root of 6.
 * @author Sean A. Irvine
 */
public class A011225 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011225() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(16).inverse()));
  }
}
