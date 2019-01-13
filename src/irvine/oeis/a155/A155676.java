package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155676.
 * @author Sean A. Irvine
 */
public class A155676 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.valueOf(9).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
