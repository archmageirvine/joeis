package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011223 Decimal expansion of 14th root of 6.
 * @author Sean A. Irvine
 */
public class A011223 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011223() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(14).inverse()));
  }
}
