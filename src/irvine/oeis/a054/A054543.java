package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a006.A006752;

/**
 * A054543 Engel series expansion (or "Egyptian product") for Catalan's constant G.
 * @author Sean A. Irvine
 */
public class A054543 extends EngelExpansionSequence {

  @Override
  protected CR getN() {
    return new A006752().getCR();
  }
}
