package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011392 Decimal expansion of 18th root of 17.
 * @author Sean A. Irvine
 */
public class A011392 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011392() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(18).inverse()));
  }
}
