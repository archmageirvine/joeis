package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011152 Decimal expansion of 5th root of 67.
 * @author Sean A. Irvine
 */
public class A011152 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011152() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(67), CR.FIVE.inverse()));
  }
}
