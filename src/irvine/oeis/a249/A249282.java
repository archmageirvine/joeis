package irvine.oeis.a249;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093341
 * @author Sean A. Irvine
 */
public class A249282 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A249282() {
    super(1, CR.HALF.ellipticK());
  }
}
