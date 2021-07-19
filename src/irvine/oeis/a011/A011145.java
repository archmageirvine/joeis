package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011145 Decimal expansion of 5th root of 60.
 * @author Sean A. Irvine
 */
public class A011145 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011145() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(60), CR.FIVE.inverse()));
  }
}
