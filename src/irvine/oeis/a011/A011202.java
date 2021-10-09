package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011202 Decimal expansion of 8th root of 5.
 * @author Sean A. Irvine
 */
public class A011202 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011202() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.EIGHT.inverse()));
  }
}
