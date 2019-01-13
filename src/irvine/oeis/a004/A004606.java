package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004606.
 * @author Sean A. Irvine
 */
public class A004606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004606() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
