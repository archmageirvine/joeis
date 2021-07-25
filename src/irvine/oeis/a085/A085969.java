package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085969 Decimal expansion of the prime zeta function at 9.
 * @author Sean A. Irvine
 */
public class A085969 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085969() {
    super(-2, Zeta.zetap(9));
  }
}

