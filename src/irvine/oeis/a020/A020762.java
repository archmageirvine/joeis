package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020762.
 * @author Sean A. Irvine
 */
public class A020762 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
