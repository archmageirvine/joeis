package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004564 Expansion of <code>sqrt(6)</code> in base 5.
 * @author Sean A. Irvine
 */
public class A004564 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A004564() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
