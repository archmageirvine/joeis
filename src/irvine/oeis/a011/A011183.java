package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011183 Decimal expansion of 5th root of 98.
 * @author Sean A. Irvine
 */
public class A011183 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011183() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(98), CR.FIVE.inverse()));
  }
}
