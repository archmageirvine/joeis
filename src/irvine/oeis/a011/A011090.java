package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011090 Decimal expansion of 4th root of 99.
 * @author Sean A. Irvine
 */
public class A011090 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011090() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(99), CR.FOUR.inverse()));
  }
}
