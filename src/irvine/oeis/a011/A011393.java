package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011393 Decimal expansion of 19th root of 17.
 * @author Sean A. Irvine
 */
public class A011393 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011393() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(19).inverse()));
  }
}
