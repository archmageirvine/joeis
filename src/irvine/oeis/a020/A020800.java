package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020800.
 * @author Sean A. Irvine
 */
public class A020800 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(43).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
