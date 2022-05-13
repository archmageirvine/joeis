package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346933 Decimal expansion of 2 * Pi^2 / 27.
 * @author Sean A. Irvine
 */
public class A346933 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346933() {
    super(CR.PI.square().multiply(CR.TWO).divide(CR.valueOf(27)));
  }
}

