package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068439 Expansion of Pi in base 14.
 * @author Sean A. Irvine
 */
public class A068439 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068439() {
    super(false, 14);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
