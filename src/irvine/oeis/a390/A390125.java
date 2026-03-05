package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390125 Decimal expansion of imaginary part of Integral_{x=1/e..1} log(log(x))/(1+x^2) dx.
 * @author Sean A. Irvine
 */
public class A390125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390125() {
    super(1, CR.PI.square().divide(4).subtract(CR.PI.multiply(ComputableReals.SINGLETON.atan(CR.E.inverse()))));
  }
}
