package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011385 Decimal expansion of 11th root of 17.
 * @author Sean A. Irvine
 */
public class A011385 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011385() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(11).inverse()));
  }
}
