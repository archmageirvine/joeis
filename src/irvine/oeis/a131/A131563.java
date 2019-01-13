package irvine.oeis.a131;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A131563.
 * @author Sean A. Irvine
 */
public class A131563 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.PI).multiply(CR.PHI);

  @Override
  protected CR getCR() {
    return N;
  }
}
