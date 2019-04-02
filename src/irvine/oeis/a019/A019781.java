package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019781.
 * @author Sean A. Irvine
 */
public class A019781 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(8));

  @Override
  protected CR getCR() {
    return N;
  }
}
