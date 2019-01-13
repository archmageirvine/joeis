package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068985.
 * @author Sean A. Irvine
 */
public class A068985 extends DecimalExpansionSequence {

  private static final CR N = CR.E.inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
