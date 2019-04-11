package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004565 Expansion of <code>sqrt(6)</code> in base 6.
 * @author Sean A. Irvine
 */
public class A004565 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004565() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
