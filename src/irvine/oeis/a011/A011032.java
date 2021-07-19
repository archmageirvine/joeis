package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011032 Decimal expansion of 4th root of 38.
 * @author Sean A. Irvine
 */
public class A011032 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011032() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(38), CR.FOUR.inverse()));
  }
}
