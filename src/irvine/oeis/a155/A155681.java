package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155681.
 * @author Sean A. Irvine
 */
public class A155681 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
