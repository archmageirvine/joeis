package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346260 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346260 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346260() {
    super(CR.PI.pow(8).multiply(24611).divide(CR.SQRT2.multiply(165150720)));
  }
}

