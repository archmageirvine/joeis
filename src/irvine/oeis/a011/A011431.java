package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011431 Decimal expansion of 12th root of 20.
 * @author Sean A. Irvine
 */
public class A011431 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011431() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(12).inverse()));
  }
}
