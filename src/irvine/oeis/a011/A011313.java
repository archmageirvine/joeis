package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011313 Decimal expansion of 14th root of 12.
 * @author Sean A. Irvine
 */
public class A011313 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011313() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(14).inverse()));
  }
}
