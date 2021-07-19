package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011418 Decimal expansion of 14th root of 19.
 * @author Sean A. Irvine
 */
public class A011418 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011418() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(14).inverse()));
  }
}
