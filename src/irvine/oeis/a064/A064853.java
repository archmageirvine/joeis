package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a068.A068466;

/**
 * A064853 Lemniscate constant.
 * @author Sean A. Irvine
 */
public class A064853 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A064853() {
    super(A068466.GAMMA_QUARTER.multiply(A068466.GAMMA_QUARTER).divide(CR.SQRT_PI).divide(CR.SQRT2));
  }
}

