package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004545 Expansion of sqrt(2) in base 8.
 * @author Sean A. Irvine
 */
public class A004545 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004545() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
