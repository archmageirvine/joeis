package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011148 Decimal expansion of 5th root of 63.
 * @author Sean A. Irvine
 */
public class A011148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011148() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(63), CR.FIVE.inverse()));
  }
}
