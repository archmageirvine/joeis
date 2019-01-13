package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068438.
 * @author Sean A. Irvine
 */
public class A068438 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068438() {
    super(false, 13);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
