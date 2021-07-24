package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A051559 Decimal expansion of tan(Pi/2 degrees). (Of course, tan(Pi/2 radians) = infinity.).
 * @author Sean A. Irvine
 */
public class A051559 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051559() {
    super(0, ComputableReals.SINGLETON.tan(CR.PI.multiply(CR.PI).divide(CR.valueOf(360))));
  }
}
