package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004542.
 * @author Sean A. Irvine
 */
public class A004542 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004542() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
