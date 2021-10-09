package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085967 Decimal expansion of the prime zeta function at 7.
 * @author Sean A. Irvine
 */
public class A085967 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085967() {
    super(Zeta.zetap(7));
  }
}

