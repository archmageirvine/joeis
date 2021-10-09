package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011292 Decimal expansion of 8th root of 11.
 * @author Sean A. Irvine
 */
public class A011292 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011292() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.EIGHT.inverse()));
  }
}
