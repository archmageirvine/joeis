package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011023 Decimal expansion of 4th root of 28.
 * @author Sean A. Irvine
 */
public class A011023 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011023() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(28), CR.FOUR.inverse()));
  }
}
