package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085966 Decimal expansion of the prime zeta function at 6.
 * @author Sean A. Irvine
 */
public class A085966 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085966() {
    super(Zeta.zetap(6));
  }
}

