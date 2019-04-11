package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004547 Expansion of <code>sqrt(3)</code> in base 2.
 * @author Sean A. Irvine
 */
public class A004547 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004547() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
