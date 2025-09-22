package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388147 Decimal expansion of Integral_{x=0..1} PolyGamma(x)*sin(Pi*x)^2 dx (negated).
 * @author Sean A. Irvine
 */
public class A388147 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388147() {
    super(0, CR.GAMMA.add(CR.TAU.log()).divide(2));
  }
}
