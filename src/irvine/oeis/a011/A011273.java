package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011273 Decimal expansion of 19th root of 9.
 * @author Sean A. Irvine
 */
public class A011273 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011273() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.valueOf(19).inverse()));
  }
}
