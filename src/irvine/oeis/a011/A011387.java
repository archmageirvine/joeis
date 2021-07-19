package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011387 Decimal expansion of 13th root of 17.
 * @author Sean A. Irvine
 */
public class A011387 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011387() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(13).inverse()));
  }
}
