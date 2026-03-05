package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393630 Decimal expansion of imaginary part of Integral_{x=0..1/e} log(log(x))/(1+x^2) dx.
 * @author Sean A. Irvine
 */
public class A393630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393630() {
    super(1, CR.PI.multiply(ComputableReals.SINGLETON.atan(CR.E.inverse())));
  }
}
