package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011344 Decimal expansion of 15th root of 14.
 * @author Sean A. Irvine
 */
public class A011344 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011344() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(15).inverse()));
  }
}
