package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011230 Decimal expansion of 6th root of 7.
 * @author Sean A. Irvine
 */
public class A011230 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011230() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.SIX.inverse()));
  }
}
