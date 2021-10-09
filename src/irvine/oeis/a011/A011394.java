package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011394 Decimal expansion of 20th root of 17.
 * @author Sean A. Irvine
 */
public class A011394 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011394() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(20).inverse()));
  }
}
