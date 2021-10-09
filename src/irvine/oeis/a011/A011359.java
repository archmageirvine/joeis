package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011359 Decimal expansion of 15th root of 15.
 * @author Sean A. Irvine
 */
public class A011359 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011359() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(15).inverse()));
  }
}
