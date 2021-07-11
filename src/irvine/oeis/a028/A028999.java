package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A028999 Binary expansion of arctan(1/2)/Pi.
 * @author Sean A. Irvine
 */
public class A028999 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A028999() {
    super(0, ComputableReals.SINGLETON.atan(CR.HALF).divide(CR.PI), 2);
  }
}
