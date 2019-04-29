package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020784.
 * @author Sean A. Irvine
 */
public class A020784 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(27).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
