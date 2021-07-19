package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011416 Decimal expansion of 12th root of 19.
 * @author Sean A. Irvine
 */
public class A011416 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011416() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(12).inverse()));
  }
}
