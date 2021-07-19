package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011265 Decimal expansion of 11th root of 9.
 * @author Sean A. Irvine
 */
public class A011265 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011265() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.valueOf(11).inverse()));
  }
}
