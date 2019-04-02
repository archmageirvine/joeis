package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004600 Expansion of e in base 9.
 * @author Sean A. Irvine
 */
public class A004600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004600() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
