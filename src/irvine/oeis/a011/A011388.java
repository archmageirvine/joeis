package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011388 Decimal expansion of 14th root of 17.
 * @author Sean A. Irvine
 */
public class A011388 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011388() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(14).inverse()));
  }
}
