package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.oeis.PierceExpansionSequence;

/**
 * A006283 Pierce expansion for <code>1 /</code> Pi.
 * @author Sean A. Irvine
 */
public class A006283 extends PierceExpansionSequence {

  @Override
  protected CR getN() {
    return CR.PI;
  }
}
