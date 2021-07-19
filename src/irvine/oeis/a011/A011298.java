package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011298 Decimal expansion of 14th root of 11.
 * @author Sean A. Irvine
 */
public class A011298 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011298() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(14).inverse()));
  }
}
