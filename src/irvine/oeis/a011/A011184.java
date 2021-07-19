package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011184 Decimal expansion of 5th root of 99.
 * @author Sean A. Irvine
 */
public class A011184 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011184() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(99), CR.FIVE.inverse()));
  }
}
