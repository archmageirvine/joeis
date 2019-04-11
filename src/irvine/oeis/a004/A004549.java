package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004549 Expansion of <code>sqrt(3)</code> in base 4.
 * @author Sean A. Irvine
 */
public class A004549 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004549() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
