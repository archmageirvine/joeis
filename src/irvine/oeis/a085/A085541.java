package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085541 Decimal expansion of the prime zeta function at 3.
 * @author Sean A. Irvine
 */
public class A085541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085541() {
    super(Zeta.zetap(3));
  }
}

