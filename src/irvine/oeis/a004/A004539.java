package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004539 Expansion of <code>sqrt(2)</code> in base 2.
 * @author Sean A. Irvine
 */
public class A004539 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004539() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
