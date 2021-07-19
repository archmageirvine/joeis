package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011035 Decimal expansion of 4th root of 41.
 * @author Sean A. Irvine
 */
public class A011035 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011035() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(41), CR.FOUR.inverse()));
  }
}
