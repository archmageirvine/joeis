package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011322 Decimal expansion of 8th root of 13.
 * @author Sean A. Irvine
 */
public class A011322 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011322() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.EIGHT.inverse()));
  }
}
