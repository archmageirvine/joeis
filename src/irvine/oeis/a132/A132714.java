package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132714.
 * @author Sean A. Irvine
 */
public class A132714 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
