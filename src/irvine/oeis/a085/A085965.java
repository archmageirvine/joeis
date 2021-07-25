package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085965 Decimal expansion of the prime zeta function at 5.
 * @author Sean A. Irvine
 */
public class A085965 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085965() {
    super(Zeta.zetap(5));
  }
}

