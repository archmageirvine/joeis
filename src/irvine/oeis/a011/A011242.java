package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011242 Decimal expansion of 18th root of 7.
 * @author Sean A. Irvine
 */
public class A011242 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011242() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(18).inverse()));
  }
}
