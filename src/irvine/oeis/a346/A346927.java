package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346727 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346927 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346927() {
    super(CR.PI.pow(10).multiply(73).divide(CR.valueOf(6842880)));
  }
}

