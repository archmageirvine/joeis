package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020785.
 * @author Sean A. Irvine
 */
public class A020785 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(28).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
