package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A028999 Binary expansion of arctan(1/2)/Pi.
 * @author Sean A. Irvine
 */
public class A028999 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.atan(CR.HALF).divide(CR.PI);

  /** Construct the sequence */
  public A028999() {
    super(true, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
