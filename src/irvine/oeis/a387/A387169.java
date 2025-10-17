package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387169 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A387169 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387169() {
    super(1, CR.HALF_PI.multiply(CR.FIVE.sqrt()).cosh().multiply(CR.PI.divide(CR.SQRT2).csch()).divide(CR.SQRT2));
  }
}
