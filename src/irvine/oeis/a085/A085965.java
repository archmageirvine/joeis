package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085965 Decimal expansion of the prime zeta function at 5.
 * @author Sean A. Irvine
 */
public class A085965 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085965() {
    super(0, Zeta.zetap(5));
  }
}

