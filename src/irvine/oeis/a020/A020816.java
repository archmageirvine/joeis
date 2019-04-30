package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020816 Decimal expansion of <code>1/sqrt(59)</code>.
 * @author Sean A. Irvine
 */
public class A020816 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(59).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
