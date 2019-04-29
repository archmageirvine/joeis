package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020783.
 * @author Sean A. Irvine
 */
public class A020783 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(26).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
