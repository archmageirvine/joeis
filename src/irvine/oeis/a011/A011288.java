package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011288 Decimal expansion of 19th root of 10.
 * @author Sean A. Irvine
 */
public class A011288 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011288() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(19).inverse()));
  }
}
