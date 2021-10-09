package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011439 Decimal expansion of 20th root of 20.
 * @author Sean A. Irvine
 */
public class A011439 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011439() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(20).inverse()));
  }
}
