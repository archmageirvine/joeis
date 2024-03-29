package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011432 Decimal expansion of 13th root of 20.
 * @author Sean A. Irvine
 */
public class A011432 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011432() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(13).inverse()));
  }
}
