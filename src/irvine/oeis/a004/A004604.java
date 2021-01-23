package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004604 Expansion of Pi in base 5.
 * @author Sean A. Irvine
 */
public class A004604 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004604() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
