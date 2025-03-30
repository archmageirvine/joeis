package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a006.A006752;

/**
 * A054543 Engel series expansion (or "Egyptian product") for Catalan's constant G.
 * @author Sean A. Irvine
 */
public class A054543 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A054543() {
    super(new A006752().getCR());
  }
}
