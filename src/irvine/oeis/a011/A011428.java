package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011428 Decimal expansion of 9th root of 20.
 * @author Sean A. Irvine
 */
public class A011428 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011428() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.NINE.inverse()));
  }
}
