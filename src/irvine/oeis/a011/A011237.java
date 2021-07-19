package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011237 Decimal expansion of 13th root of 7.
 * @author Sean A. Irvine
 */
public class A011237 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011237() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(13).inverse()));
  }
}
