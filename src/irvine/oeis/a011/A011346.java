package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011346 Decimal expansion of 17th root of 14.
 * @author Sean A. Irvine
 */
public class A011346 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011346() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(17).inverse()));
  }
}
