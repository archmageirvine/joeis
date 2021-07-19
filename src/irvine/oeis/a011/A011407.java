package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011407 Decimal expansion of 18th root of 18.
 * @author Sean A. Irvine
 */
public class A011407 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011407() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(18).inverse()));
  }
}
