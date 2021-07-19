package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011236 Decimal expansion of 12th root of 7.
 * @author Sean A. Irvine
 */
public class A011236 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011236() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(12).inverse()));
  }
}
