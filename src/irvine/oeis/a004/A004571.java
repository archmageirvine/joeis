package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004571.
 * @author Sean A. Irvine
 */
public class A004571 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).sqrt();

  /** Construct the sequence. */
  public A004571() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
