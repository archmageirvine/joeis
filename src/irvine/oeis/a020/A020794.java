package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020794.
 * @author Sean A. Irvine
 */
public class A020794 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(37).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
