package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388554 Decimal expansion of (sqrt(41+29 * sqrt(2)) * Gamma(1/4)^4 * sin(Pi / 8)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A388554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388554() {
    super(1, CR.TWO.pow(new Q(3, 4)).divide(16).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
