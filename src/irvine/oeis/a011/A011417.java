package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011417 Decimal expansion of 13th root of 19.
 * @author Sean A. Irvine
 */
public class A011417 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011417() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(13).inverse()));
  }
}
