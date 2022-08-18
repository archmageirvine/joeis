package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085968 Decimal expansion of the prime zeta function at 8.
 * @author Sean A. Irvine
 */
public class A085968 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085968() {
    super(0, Zeta.zetap(8));
  }
}

