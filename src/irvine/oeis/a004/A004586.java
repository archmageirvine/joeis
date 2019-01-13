package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004586.
 * @author Sean A. Irvine
 */
public class A004586 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).sqrt();

  /** Construct the sequence. */
  public A004586() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
