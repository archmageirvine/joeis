package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011016 Decimal expansion of 4th root of 20.
 * @author Sean A. Irvine
 */
public class A011016 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011016() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.FOUR.inverse()));
  }
}
