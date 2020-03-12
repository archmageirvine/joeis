package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A099286.
 * @author Sean A. Irvine
 */
public class A099286 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.erf();

  @Override
  protected CR getCR() {
    return N;
  }
}
