package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346931 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346931 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346931() {
    super(CR.PI.pow(6).multiply(403).divide(CR.valueOf(393660)));
  }
}

