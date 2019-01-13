package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004598.
 * @author Sean A. Irvine
 */
public class A004598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004598() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
