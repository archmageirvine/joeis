package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011310 Decimal expansion of 11th root of 12.
 * @author Sean A. Irvine
 */
public class A011310 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011310() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(11).inverse()));
  }
}
