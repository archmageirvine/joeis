package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004595 Expansion of e in base 4.
 * @author Sean A. Irvine
 */
public class A004595 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004595() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
