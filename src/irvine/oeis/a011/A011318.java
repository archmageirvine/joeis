package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011318 Decimal expansion of 19th root of 12.
 * @author Sean A. Irvine
 */
public class A011318 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011318() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(19).inverse()));
  }
}
