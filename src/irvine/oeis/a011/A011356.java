package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011356 Decimal expansion of 12th root of 15.
 * @author Sean A. Irvine
 */
public class A011356 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011356() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(12).inverse()));
  }
}
