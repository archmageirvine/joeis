package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011173 Decimal expansion of 5th root of 88.
 * @author Sean A. Irvine
 */
public class A011173 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011173() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(88), CR.FIVE.inverse()));
  }
}
