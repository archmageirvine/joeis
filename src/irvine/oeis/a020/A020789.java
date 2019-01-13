package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020789.
 * @author Sean A. Irvine
 */
public class A020789 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(32).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
