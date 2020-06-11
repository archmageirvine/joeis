package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004586 Expansion of <code>sqrt(10)</code> in base 3.
 * @author Sean A. Irvine
 */
public class A004586 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004586() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
