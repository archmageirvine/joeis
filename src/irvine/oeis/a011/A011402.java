package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011402 Decimal expansion of 13th root of 18.
 * @author Sean A. Irvine
 */
public class A011402 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011402() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(13).inverse()));
  }
}
