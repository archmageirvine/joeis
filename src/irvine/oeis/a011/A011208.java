package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011208 Decimal expansion of 14th root of 5.
 * @author Sean A. Irvine
 */
public class A011208 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011208() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(14).inverse()));
  }
}
