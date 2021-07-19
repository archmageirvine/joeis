package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011342 Decimal expansion of 13th root of 14.
 * @author Sean A. Irvine
 */
public class A011342 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011342() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(13).inverse()));
  }
}
