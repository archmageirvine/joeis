package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a002.A002210;

/**
 * A054544 Engel series expansion (or "Egyptian product") for Khintchine's constant.
 * @author Sean A. Irvine
 */
public class A054544 extends EngelExpansionSequence {

  {
    setOffset(0);
  }

  /** Construct the sequence. */
  public A054544() {
    super(new A002210().getCR());
  }
}
