package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346728 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346728 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346728() {
    super(CR.PI.pow(4).multiply(11).divide(CR.SQRT2.multiply(768)));
  }
}

