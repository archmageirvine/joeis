package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011382 Decimal expansion of 8th root of 17.
 * @author Sean A. Irvine
 */
public class A011382 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011382() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.EIGHT.inverse()));
  }
}
