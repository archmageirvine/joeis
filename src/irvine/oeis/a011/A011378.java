package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011378 Decimal expansion of 19th root of 16.
 * @author Sean A. Irvine
 */
public class A011378 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011378() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(19).inverse()));
  }
}
