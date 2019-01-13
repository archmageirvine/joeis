package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004541.
 * @author Sean A. Irvine
 */
public class A004541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004541() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
