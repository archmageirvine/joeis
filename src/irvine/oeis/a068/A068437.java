package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068437 Expansion of Pi in base 12.
 * @author Sean A. Irvine
 */
public class A068437 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068437() {
    super(false, 12);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
