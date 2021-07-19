package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011222 Decimal expansion of 13th root of 6.
 * @author Sean A. Irvine
 */
public class A011222 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011222() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(13).inverse()));
  }
}
