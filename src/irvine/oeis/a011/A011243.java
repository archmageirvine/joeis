package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011243 Decimal expansion of 19th root of 7.
 * @author Sean A. Irvine
 */
public class A011243 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011243() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(19).inverse()));
  }
}
