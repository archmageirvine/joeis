package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346571 Decimal expansion of 2 - 305 * Pi^5 / 93312.
 * @author Sean A. Irvine
 */
public class A346571 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346571() {
    super(0, CR.TWO.subtract(CR.PI.pow(5).multiply(305).divide(CR.valueOf(93312))));
  }
}

