package irvine.oeis.a371;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371860 Decimal expansion of Integral_{x=0..1} 1 / sqrt(1 - x^3) dx.
 * @author Georg Fischer
 */
public class A371860 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371860() {
    super(1, CrFunctions.GAMMA.cr(CR.valueOf(new Q(1, 6))).multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(1, 3)))).divide(CR.THREE.multiply(CR.SQRT_PI)).divide(2));
  }
}
