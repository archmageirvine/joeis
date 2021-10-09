package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011027 Decimal expansion of 4th root of 32.
 * @author Sean A. Irvine
 */
public class A011027 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011027() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(32), CR.FOUR.inverse()));
  }
}
