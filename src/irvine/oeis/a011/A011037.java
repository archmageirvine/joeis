package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011037 Decimal expansion of 4th root of 43.
 * @author Sean A. Irvine
 */
public class A011037 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011037() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(43), CR.FOUR.inverse()));
  }
}
