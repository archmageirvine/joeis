package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155554.
 * @author Sean A. Irvine
 */
public class A155554 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.valueOf(6).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
