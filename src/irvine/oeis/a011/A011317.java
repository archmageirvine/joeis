package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011317 Decimal expansion of 18th root of 12.
 * @author Sean A. Irvine
 */
public class A011317 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011317() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(18).inverse()));
  }
}
