package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004544.
 * @author Sean A. Irvine
 */
public class A004544 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004544() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
