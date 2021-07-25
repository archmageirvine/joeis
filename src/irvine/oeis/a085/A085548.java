package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A085548 Decimal expansion of the prime zeta function at 2: Sum_{p prime} 1/p^2.
 * @author Sean A. Irvine
 */
public class A085548 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085548() {
    super(Zeta.zetap(2));
  }
}

