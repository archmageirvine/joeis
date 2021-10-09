package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011434 Decimal expansion of 15th root of 20.
 * @author Sean A. Irvine
 */
public class A011434 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011434() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(15).inverse()));
  }
}
