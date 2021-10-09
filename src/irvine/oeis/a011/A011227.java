package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011227 Decimal expansion of 18th root of 6.
 * @author Sean A. Irvine
 */
public class A011227 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011227() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(18).inverse()));
  }
}
