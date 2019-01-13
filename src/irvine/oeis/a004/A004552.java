package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004552.
 * @author Sean A. Irvine
 */
public class A004552 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.sqrt();

  /** Construct the sequence. */
  public A004552() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
