package irvine.oeis.a188;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188640.
 * @author Sean A. Irvine
 */
public class A188640 extends DecimalExpansionSequence {

  private static final CR N = CR.E.add(CR.ONE.add(CR.E.multiply(CR.E)).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
