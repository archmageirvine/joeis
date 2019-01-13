package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004608.
 * @author Sean A. Irvine
 */
public class A004608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004608() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
