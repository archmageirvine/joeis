package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011198 Decimal expansion of 19th root of 4.
 * @author Sean A. Irvine
 */
public class A011198 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011198() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(19).inverse()));
  }
}
