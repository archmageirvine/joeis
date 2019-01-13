package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.PierceExpansionSequence;

/**
 * A006284.
 * @author Sean A. Irvine
 */
public class A006284 extends PierceExpansionSequence {

  @Override
  protected CR getN() {
    return EulerGamma.SINGLETON.inverse();
  }
}
