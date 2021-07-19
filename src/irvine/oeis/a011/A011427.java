package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011427 Decimal expansion of 8th root of 20.
 * @author Sean A. Irvine
 */
public class A011427 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011427() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.EIGHT.inverse()));
  }
}
