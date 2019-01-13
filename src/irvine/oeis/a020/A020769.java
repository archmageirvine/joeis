package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020769.
 * @author Sean A. Irvine
 */
public class A020769 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
