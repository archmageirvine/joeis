package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011082 Decimal expansion of 4th root of 91.
 * @author Sean A. Irvine
 */
public class A011082 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011082() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(91), CR.FOUR.inverse()));
  }
}
