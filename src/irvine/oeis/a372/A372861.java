package irvine.oeis.a372;
// manually equa/decexp at 2025-02-08 12:52

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A372861 Decimal expansion of (1 + log(16))/256.
 * Formula:
 * @author Georg Fischer
 */
public class A372861 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A372861() {
    super(0, CR.ONE.add(CR.valueOf(16).log()).divide(CR.valueOf(256)));
    next();
  }
}
