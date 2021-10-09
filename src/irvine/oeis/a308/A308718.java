package irvine.oeis.a308;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A308718 Decimal expansion of Pi*sech(Pi/2)/2.
 * @author Sean A. Irvine
 */
public class A308718 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A308718() {
    super(CR.HALF_PI.multiply(ComputableReals.SINGLETON.sech(CR.HALF_PI)));
  }
}
