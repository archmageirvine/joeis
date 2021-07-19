package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011263 Decimal expansion of 9th root of 9.
 * @author Sean A. Irvine
 */
public class A011263 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011263() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.NINE.inverse()));
  }
}
