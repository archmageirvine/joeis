package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011019 Decimal expansion of 4th root of 23.
 * @author Sean A. Irvine
 */
public class A011019 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011019() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(23), CR.FOUR.inverse()));
  }
}
