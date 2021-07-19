package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011419 Decimal expansion of 15th root of 19.
 * @author Sean A. Irvine
 */
public class A011419 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011419() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(15).inverse()));
  }
}
