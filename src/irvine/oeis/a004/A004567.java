package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004567.
 * @author Sean A. Irvine
 */
public class A004567 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004567() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
