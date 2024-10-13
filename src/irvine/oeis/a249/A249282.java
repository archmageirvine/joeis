package irvine.oeis.a249;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A249282 Decimal expansion of K(1/4), where K is the complete elliptic integral of the first kind.
 * @author Sean A. Irvine
 */
public class A249282 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A249282() {
    super(1, CR.HALF.ellipticK());
  }
}
