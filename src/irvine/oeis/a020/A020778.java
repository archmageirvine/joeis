package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020778.
 * @author Sean A. Irvine
 */
public class A020778 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
