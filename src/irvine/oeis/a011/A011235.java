package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011235 Decimal expansion of 11th root of 7.
 * @author Sean A. Irvine
 */
public class A011235 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011235() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(11).inverse()));
  }
}
