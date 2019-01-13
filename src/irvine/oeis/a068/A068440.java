package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068440.
 * @author Sean A. Irvine
 */
public class A068440 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068440() {
    super(false, 15);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
