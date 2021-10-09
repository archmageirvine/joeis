package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011391 Decimal expansion of 17th root of 17.
 * @author Sean A. Irvine
 */
public class A011391 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011391() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(17).inverse()));
  }
}
