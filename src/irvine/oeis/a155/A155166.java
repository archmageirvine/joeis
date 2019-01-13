package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155166.
 * @author Sean A. Irvine
 */
public class A155166 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
