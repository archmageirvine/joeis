package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011400 Decimal expansion of 11th root of 18.
 * @author Sean A. Irvine
 */
public class A011400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011400() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(11).inverse()));
  }
}
