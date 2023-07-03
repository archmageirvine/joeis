package irvine.oeis.a086;
// manually cofrman/cofr at 2022-02-25 16:22

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086703 Continued fraction expansion of Levy's constant.
 * L = exp(Pi^2/12/log(2))
 * @author Georg Fischer
 */
public class A086703 extends ContinuedFractionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A086703() {
    super(0, new DecimalExpansionSequence(REALS.exp(REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(12).multiply(CR.TWO.log())))));
  }
}

