package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004597.
 * @author Sean A. Irvine
 */
public class A004597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004597() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
