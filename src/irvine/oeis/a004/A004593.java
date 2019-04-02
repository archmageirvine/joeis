package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004593 Expansion of e in base 2.
 * @author Sean A. Irvine
 */
public class A004593 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004593() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
