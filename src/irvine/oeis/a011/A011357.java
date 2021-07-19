package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011357 Decimal expansion of 13th root of 15.
 * @author Sean A. Irvine
 */
public class A011357 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011357() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(13).inverse()));
  }
}
