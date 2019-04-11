package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004550 Expansion of <code>sqrt(3)</code> in base 5.
 * @author Sean A. Irvine
 */
public class A004550 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004550() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
