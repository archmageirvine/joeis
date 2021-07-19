package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011348 Decimal expansion of 19th root of 14.
 * @author Sean A. Irvine
 */
public class A011348 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011348() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(19).inverse()));
  }
}
