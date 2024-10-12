package irvine.oeis.a093;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093341 Decimal expansion of "lemniscate case".
 * @author Georg Fischer
 */
public class A093341 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A093341() {
    super(1, CR.SQRT2.inverse().ellipticK());
  }
}
