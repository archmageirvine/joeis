package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004566 Expansion of sqrt(6) in base 7.
 * @author Sean A. Irvine
 */
public class A004566 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004566() {
    super(1, CR.SIX.sqrt(), 7);
  }
}
