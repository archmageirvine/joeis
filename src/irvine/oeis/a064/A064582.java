package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a073.A073005;

/**
 * A064582 Real half-period for the Weierstrass elliptic function with invariants g2=0, g3=1.
 * @author Sean A. Irvine
 */
public class A064582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A064582() {
    super(A073005.GAMMA_THIRD.pow(3).divide(CR.PI).divide(CR.FOUR));
  }
}

