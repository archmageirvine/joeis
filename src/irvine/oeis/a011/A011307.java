package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011307 Decimal expansion of 8th root of 12.
 * @author Sean A. Irvine
 */
public class A011307 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011307() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.EIGHT.inverse()));
  }
}
