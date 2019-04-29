package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020795.
 * @author Sean A. Irvine
 */
public class A020795 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(38).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
