package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346932 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346932 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346932() {
    super(CR.PI.pow(4).multiply(CR.SEVEN).divide(CR.valueOf(729)));
  }
}

