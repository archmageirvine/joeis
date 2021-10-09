package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011256 Decimal expansion of 17th root of 8.
 * @author Sean A. Irvine
 */
public class A011256 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011256() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(17).inverse()));
  }
}
