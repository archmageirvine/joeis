package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222067 Decimal expansion of 1/(8*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A222067 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(192).sqrt().inverse();

  /** Construct the sequence. */
  public A222067() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
