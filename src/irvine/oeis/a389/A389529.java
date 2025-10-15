package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389529 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A389529 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389529() {
    super(0, CR.PI.square().divide(16).add(CR.LOG2.divide(2)).subtract(new A006752().getCR().divide(2)).subtract(CR.PI.divide(8)));
  }
}

