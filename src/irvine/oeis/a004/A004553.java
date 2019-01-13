package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004553.
 * @author Sean A. Irvine
 */
public class A004553 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004553() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
