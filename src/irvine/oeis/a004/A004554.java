package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004554 Expansion of <code>sqrt(3)</code> in base 9.
 * @author Sean A. Irvine
 */
public class A004554 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004554() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
