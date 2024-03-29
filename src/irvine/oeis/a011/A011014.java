package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011014 Decimal expansion of 4th root of 18.
 * @author Sean A. Irvine
 */
public class A011014 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011014() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.FOUR.inverse()));
  }
}
