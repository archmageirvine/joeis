package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011087 Decimal expansion of 4th root of 96.
 * @author Sean A. Irvine
 */
public class A011087 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011087() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(96), CR.FOUR.inverse()));
  }
}
