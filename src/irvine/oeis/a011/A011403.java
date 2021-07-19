package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011403 Decimal expansion of 14th root of 18.
 * @author Sean A. Irvine
 */
public class A011403 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011403() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(14).inverse()));
  }
}
