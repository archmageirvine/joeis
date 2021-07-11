package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004609 Expansion of sqrt(6) in base 2.
 * @author Sean A. Irvine
 */
public class A004609 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004609() {
    super(0, CR.SIX.sqrt(), 2);
  }
}
