package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011132 Decimal expansion of 5th root of 47.
 * @author Sean A. Irvine
 */
public class A011132 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011132() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(47), CR.FIVE.inverse()));
  }
}
