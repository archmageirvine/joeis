package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011293 Decimal expansion of 9th root of 11.
 * @author Sean A. Irvine
 */
public class A011293 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011293() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.NINE.inverse()));
  }
}
