package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011056 Decimal expansion of 4th root of 63.
 * @author Sean A. Irvine
 */
public class A011056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011056() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(63), CR.FOUR.inverse()));
  }
}
