package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A001620.
 * @author Sean A. Irvine
 */
public class A001620 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON;

  @Override
  protected CR getCR() {
    return N;
  }
}
