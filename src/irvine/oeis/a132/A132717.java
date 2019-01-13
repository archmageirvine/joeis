package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132717.
 * @author Sean A. Irvine
 */
public class A132717 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(27).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
