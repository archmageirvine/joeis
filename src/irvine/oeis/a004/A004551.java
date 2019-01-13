package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004551.
 * @author Sean A. Irvine
 */
public class A004551 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004551() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
