package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381652 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A381652 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381652() {
    super(0, Zeta.zeta(3).square().subtract(Zeta.zeta(6).multiply(new Q(13, 16))));
  }
}
