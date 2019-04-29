package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020771.
 * @author Sean A. Irvine
 */
public class A020771 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
